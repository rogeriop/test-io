package gera.automatico;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comum.ClipBoard;
import comum.Curso;
import comum.Licao;
import comum.Opcoes;
import gera.manual.PaginaAulaCurso;
import transcreve.LinkLabelDiferente;

public class GeraPaginasDeAulaCurso {
	public void transforma(Curso curso) throws UnsupportedFlavorException, IOException {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 90);

		List<Licao> licoes = curso.getLicoes();

		// URL DA PÁGINA DE ÍNDICE DO CURSO
		String urlPaginaIndiceDoCurso = curso.getUrlIndiceDoCurso();
		driver.get(urlPaginaIndiceDoCurso);
		driver.manage().window().maximize();

		for (Licao licao : licoes) {

			String s = licao.getNome();
			String codigo = licao.getCodigo();

			// RETIRA CARCTERES NÃO SUPORTADOS
			s.replace("?", "");
			s.replace(":", ";");

			// ACIONA BOTÃO PARA CRIAR NOVA PÁGINA
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button")));
			driver.findElement(By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button"))
					.click();

			// PREENCHE O TÍTULO DA PÁGINA
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pageTitle")));
			driver.findElement(By.name("pageTitle"))
					.sendKeys(codigo + " " + s);

			// CONSTROI A PÁGINA DE AULA DO CURSO
			new ClipBoard().copia(new PaginaAulaCurso().transforma(curso, licao));

			// ACIONA O BOTÃO PARA O EDITOR DE HTML
			driver.findElement(By.cssSelector("span.mce_code")).click();

			// PEGA URL DA PÁGINA NOVA CRIADA E TRANSFORMA NUM LINK
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Retorno")));
			new ClipBoard()
					.copia(new LinkLabelDiferente().transforma(driver.getCurrentUrl()).replace("_blank", "_self"));

			// CLICA NO LINK RETORNO
			driver.findElement(By.linkText("Retorno")).click();

			// ACIONA BOTÃO PARA EDITAR PÁGINA ÍNDICE DO CURSO
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Edit Page")));
			driver.findElement(By.linkText("Edit Page")).click();

			// ACIONA O BOTÃO PARA O EDITOR DE HTML
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.mce_code")));
			driver.findElement(By.cssSelector("span.mce_code")).click();

			// ESPERA PELA INTERVENÇÃO DO USUÁRIO NA CRIAÇÃO DO LINK DA CHAMADA
			// DA NOVA PÁGINA
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("LinkLabelDiferente")));

		}
	}
}
