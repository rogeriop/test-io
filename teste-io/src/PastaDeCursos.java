
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PastaDeCursos {

	public void transforma(String linha) throws UnsupportedFlavorException, IOException {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String[] linhas = linha.split("\n");
		int contadorDeLinhas = 0;

		driver.get(linhas[0]);
		driver.manage().window().maximize();

		boolean primeiraLinha = true;

		for (String s : linhas) {

			if (!primeiraLinha) {
				
				// Tira caracteres n�o suportados
				s.replace("?", "");
				s.replace(":", ";");
				
				contadorDeLinhas++;
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-newFolder-button-button")));
				driver.findElement(
						By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-newFolder-button-button"))
						.click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name("prop_cm_name")));
				driver.findElement(By.name("prop_cm_name"))
						.sendKeys(((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas + " " + s);
				driver.findElement(
						By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"))
						.click();
			}

			primeiraLinha = false;
		}

	}

}
