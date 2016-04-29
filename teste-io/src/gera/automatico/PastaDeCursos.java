package gera.automatico;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comum.Curso;
import comum.Licao;
import comum.UsaCurso;

public class PastaDeCursos implements UsaCurso {

	public String transforma(Curso curso) {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		List<Licao> licoes = curso.getLicoes();

		driver.get(curso.getUrlPastasDoCurso());
		driver.manage().window().maximize();

		for (Licao licao : licoes) {

			String s = licao.getNome();
			String codigo = licao.getCodigo();
			// TIRA CARACTER NÃO SUPORTADOS
			s.replace("?", "");
			s.replace(":", ";");

			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-newFolder-button-button")));
			driver.findElement(
					By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-newFolder-button-button"))
					.click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("prop_cm_name")));
			driver.findElement(By.name("prop_cm_name"))
					.sendKeys(codigo + " " + s);
			driver.findElement(
					By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"))
					.click();
		}
		// PARA IMPLEMENTAR UMA STRING COM TODAS AS URLS DAS PASTAS CRIADAS PARA TESTES
		return null;
	}
}
