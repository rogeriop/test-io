package gera.automatico;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comum.ClipBoard;
import comum.Opcoes;
import gera.manual.LinkLabelDiferente;
import gera.manual.PaginaAulaCurso;

public class PaginasAulaCurso {
	public void transforma(String linha, Opcoes opcoes) throws UnsupportedFlavorException, IOException {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 90);

		String[] linhas = linha.split("\n");
		int contadorDeLinhas = opcoes.getNumeracao() - 1;
		
		// URL DA P�GINA DE �NDICE DO CURSO
		driver.get(linhas[0]);
		driver.manage().window().maximize();

		boolean primeiraLinha = true;

		for (String s : linhas) {

			if (!primeiraLinha) {

				// Tira caracteres n�o suportados
				s.replace("?", "");
				s.replace(":", ";");

				contadorDeLinhas++;

				// ACIONA BOT�O PARA CRIAR NOVA P�GINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button")));
				driver.findElement(By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button"))
						.click();

				// PREENCHE O T�TULO DA P�GINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.name("pageTitle")));
				driver.findElement(By.name("pageTitle"))
						.sendKeys(((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas + " " + s);

				// CONSTROI A P�GINA DE AULA DO CURSO
				new ClipBoard().copia(new PaginaAulaCurso().transforma(linhas[0]));
				
				// ACIONA O BOT�O PARA O EDITOR DE HTML
				driver.findElement(
						By.cssSelector("span.mce_code")).click();

				// ACIONA BOT�O DE SALVAR (COMENTADO TEMPORARIAMENTE PARA N�O INDUZIR USU�RIO AO ERRO)
				/*
				wait.until(ExpectedConditions.elementToBeClickable(
						By.id("template_x002e_createform_x002e_wiki-create_x0023_default-save-button-button")));
				driver.findElement(
						By.id("template_x002e_createform_x002e_wiki-create_x0023_default-save-button-button")).click();
				*/
				
				// PEGA URL DA P�GINA NOVA CRIADA E TRANSFORMA NUM LINK
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.linkText("Retorno")));
				new ClipBoard().copia(new LinkLabelDiferente().transforma(driver.getCurrentUrl()).replace("_blank", "_self"));
				
				// CLICA NO LINK RETORNO
				driver.findElement(
						By.linkText("Retorno")).click();
				
				// ACIONA BOT�O PARA EDITAR P�GINA �NDICE DO CURSO
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.linkText("Edit Page")));
				driver.findElement(
						By.linkText("Edit Page")).click();
			
				// ACIONA O BOT�O PARA O EDITOR DE HTML
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.cssSelector("span.mce_code")));
				driver.findElement(
						By.cssSelector("span.mce_code")).click();

				// ESPERA PELA INTERVEN��O DO USU�RIO NA CRIA��O DO LINK DA CHAMADA DA NOVA P�GINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.className("LinkLabelDiferente")));
				
				
			}

			primeiraLinha = false;
		}
	}
}
