package atualiza;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import comum.ConverteCursoParaXml;
import comum.Curso;
import comum.Licao;
import comum.Video;

public class AtualizaVideosDaLicaoNasPastasAlfresco {
	public String transforma(Curso curso) throws UnsupportedFlavorException, IOException {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		List<Licao> licoes = curso.getLicoes();

		driver.get(curso.getUrlPastasDoCurso());
		driver.manage().window().maximize();

		for (Licao licao : licoes) {
			String nomeDaLicao = licao.getNome();
			String numeroDaLicao = licao.getCodigo();
			List<Video> videos = licao.getVideos();

			// TIRA CARACTER NÃO SUPORTADOS
			nomeDaLicao.replace("?", "");
			nomeDaLicao.replace(":", ";");

			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(numeroDaLicao + " " + nomeDaLicao)));
			WebElement linkLicao = driver.findElement(By.linkText(numeroDaLicao + " " + nomeDaLicao));
			linkLicao.click();

			boolean primeiraVez = true;

			for (Video video : videos) {

				try {
					Thread.sleep(1000);
					driver.findElement(By.linkText(video.getNome() + ".mp4"));
					System.out.println("[Já copiado...]" + video.getNome());
				} catch (Exception e) {

					if (primeiraVez) {
						wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Upload files")));
						driver.findElement(By.linkText("Upload files")).click();
						primeiraVez = false;
					} else {
						wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
								"template_x002e_toolbar_x002e_documentlibrary_x0023_default-fileUpload-button-button")));
						driver.findElement(
								By.id("template_x002e_toolbar_x002e_documentlibrary_x0023_default-fileUpload-button-button"))
						.click();
					}
					
					// SELECIONA ARQUIVO PARA IMPORTAÇÃO NO ALFRESCO
					wait.until(ExpectedConditions.presenceOfElementLocated(
							By.id("template_x002e_html-upload_x002e_documentlibrary_x0023_default-filedata-file")));
					WebElement El = driver.findElement(
							By.id("template_x002e_html-upload_x002e_documentlibrary_x0023_default-filedata-file"));
					El.sendKeys("c:\\Users\\Antonio Rogerio\\Downloads\\ALURA\\" + curso.getCodigo() + " " + curso.getNome()
					+ "\\" + video.getNome() + ".mp4");
					
					// ACIONA BOTÃO PARA FAZER O UPLOAD
					wait.until(ExpectedConditions.presenceOfElementLocated(
							By.id("template_x002e_html-upload_x002e_documentlibrary_x0023_default-upload-button-button")));
					driver.findElement(
							By.id("template_x002e_html-upload_x002e_documentlibrary_x0023_default-upload-button-button"))
					.click();
					System.out.print("[Copiando...]" + video.getNome());
					
					// ESPERA O ARQUIVO SER COPIADO PARA CONTINUAR
					wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(video.getNome() + ".mp4")));
					System.out.println(" - copiado;");
				}

			}
			driver.get(curso.getUrlPastasDoCurso());
		}
		return ConverteCursoParaXml.toXml(curso).replace("&", "&amp;");
	}
}
