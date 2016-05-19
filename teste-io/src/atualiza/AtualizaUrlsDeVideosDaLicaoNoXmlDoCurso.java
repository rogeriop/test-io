package atualiza;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comum.ClipBoard;
import comum.ConverteCursoParaXml;
import comum.Curso;
import comum.Licao;
import comum.Video;

public class AtualizaUrlsDeVideosDaLicaoNoXmlDoCurso {

	public String transforma(Curso curso) throws UnsupportedFlavorException, IOException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		List<Licao> licoes = curso.getLicoes();

		driver.get(curso.getUrlPastasDoCurso());
		driver.manage().window().maximize();

		for (Licao licao : licoes) {

			String nomeDaLicao = licao.getNome();
			String numeroDaLicao = licao.getCodigo();
			List<Video> videos = licao.getVideos();

			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.linkText(numeroDaLicao + " " + nomeDaLicao)));
					
			driver.findElement(By.linkText(numeroDaLicao + " " + nomeDaLicao)).click();
			String urlAula = driver.getCurrentUrl();
			System.out.println("Lição  :" + licao);

			boolean primeiro = true;
			if (primeiro) {
				for (Video video : videos) {
					wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(video.getNome() + ".mp4")));
					driver.findElement(By.linkText(video.getNome() + ".mp4")).click();
					Actions builder = new Actions(driver);

					wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("View In Browser")));
					WebElement linkVerVideo = driver.findElement(By.linkText("View In Browser"));

					builder.contextClick(linkVerVideo)
					.sendKeys(Keys.chord("o"))
					.sendKeys(Keys.chord("o"))
					.sendKeys(Keys.ENTER)
					.perform();
					 
					video.setUrl(new ClipBoard().obtem());
					driver.get(urlAula);
				}
				primeiro = false;
			}
			System.out.println("Videos :" + videos);
			driver.get(curso.getUrlPastasDoCurso());
		}

		return ConverteCursoParaXml.toXml(curso).replace("&", "&amp;");
	}

}
