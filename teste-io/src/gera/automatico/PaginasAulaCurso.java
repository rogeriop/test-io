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
		
		// URL DA PÁGINA DE ÍNDICE DO CURSO
		driver.get(linhas[0]);
		driver.manage().window().maximize();

		boolean primeiraLinha = true;

		for (String s : linhas) {

			if (!primeiraLinha) {

				// Tira caracteres não suportados
				s.replace("?", "");
				s.replace(":", ";");

				contadorDeLinhas++;

				// ACIONA BOTÃO PARA CRIAR NOVA PÁGINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button")));
				driver.findElement(By.id("template_x002e_toolbar_x002e_wiki-page_x0023_default-create-button-button"))
						.click();

				// PREENCHE O TÍTULO DA PÁGINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.name("pageTitle")));
				driver.findElement(By.name("pageTitle"))
						.sendKeys(((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas + " " + s);

				// CONSTROI A PÁGINA DE AULA DO CURSO
				new ClipBoard().copia(new PaginaAulaCurso().transforma(linhas[0]));
				
				// ACIONA O BOTÃO PARA O EDITOR DE HTML
				driver.findElement(
						By.cssSelector("span.mce_code")).click();

				// ACIONA BOTÃO DE SALVAR (COMENTADO TEMPORARIAMENTE PARA NÃO INDUZIR USUÁRIO AO ERRO)
				/*
				wait.until(ExpectedConditions.elementToBeClickable(
						By.id("template_x002e_createform_x002e_wiki-create_x0023_default-save-button-button")));
				driver.findElement(
						By.id("template_x002e_createform_x002e_wiki-create_x0023_default-save-button-button")).click();
				*/
				
				// PEGA URL DA PÁGINA NOVA CRIADA E TRANSFORMA NUM LINK
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.linkText("Retorno")));
				new ClipBoard().copia(new LinkLabelDiferente().transforma(driver.getCurrentUrl()).replace("_blank", "_self"));
				
				// CLICA NO LINK RETORNO
				driver.findElement(
						By.linkText("Retorno")).click();
				
				// ACIONA BOTÃO PARA EDITAR PÁGINA ÍNDICE DO CURSO
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.linkText("Edit Page")));
				driver.findElement(
						By.linkText("Edit Page")).click();
			
				// ACIONA O BOTÃO PARA O EDITOR DE HTML
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.cssSelector("span.mce_code")));
				driver.findElement(
						By.cssSelector("span.mce_code")).click();

				// ESPERA PELA INTERVENÇÃO DO USUÁRIO NA CRIAÇÃO DO LINK DA CHAMADA DA NOVA PÁGINA
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.className("LinkLabelDiferente")));
				
				
			}

			primeiraLinha = false;
		}
	}
}
