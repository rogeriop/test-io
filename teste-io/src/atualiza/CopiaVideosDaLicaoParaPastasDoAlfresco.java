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

public class CopiaVideosDaLicaoParaPastasDoAlfresco {
	public String transforma(Curso curso) throws UnsupportedFlavorException, IOException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		List<Licao> licoes = curso.getLicoes();

		driver.get(curso.getUrlPastasDoCurso());
		driver.manage().window().maximize();
		
		String botaoSelecionarArquivoNaJanelaUploadFile = "template_x002e_html-upload_x002e_documentlibrary_x0023_default-filedata-file";
		String botaoUploadFileNaJanelaUploadFile = "template_x002e_html-upload_x002e_documentlibrary_x0023_default-upload-button-button";
		String botaoUploadNaBarraDeComandosSuperior = "template_x002e_toolbar_x002e_documentlibrary_x0023_default-fileUpload-button-button";
		String linkUploadfilesNoLadoEsquerdoInferiorAreaDeArquivos = "Upload files";

		String codigoDoCurso = curso.getCodigo();
		String nomeDoCurso = curso.getNome();
		String diretorioDoCurso = curso.getDiretorioVideos();

		for (Licao licao : licoes) {
			String numeroDaLicao = licao.getCodigo();
			String nomeDaLicao = licao.getNome();
			List<Video> videos = licao.getVideos();

			// ENTRA NA PASTA DA LIÇÃO
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(numeroDaLicao + " " + nomeDaLicao)));
			WebElement linkLicao = driver.findElement(By.linkText(numeroDaLicao + " " + nomeDaLicao));
			linkLicao.click();

			boolean primeiroVideoDaPasta = true;

			for (Video video : videos) {
				String nomeDoVideo = video.getNome() + ".mp4";

				try {
					Thread.sleep(1000);
					driver.findElement(By.linkText(nomeDoVideo));
					System.out.println("[Já copiado...]" + nomeDoVideo);
					primeiroVideoDaPasta = false;
				} catch (Exception e) {
					// AÇÃO PARA CARREGAR JANELA UPLOAD FILE
					if (primeiroVideoDaPasta) {
						wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkUploadfilesNoLadoEsquerdoInferiorAreaDeArquivos)));
						driver.findElement(By.linkText(linkUploadfilesNoLadoEsquerdoInferiorAreaDeArquivos)).click();
						primeiroVideoDaPasta = false;
					} else {
						wait.until(ExpectedConditions.presenceOfElementLocated(By.id(botaoUploadNaBarraDeComandosSuperior)));
						driver.findElement(By.id(botaoUploadNaBarraDeComandosSuperior)).click();
					}
					
					// SELECIONA ARQUIVO PARA IMPORTAÇÃO NO ALFRESCO
//					System.out.println(diretorioDoCurso + "\\" + codigoDoCurso + " " + nomeDoCurso + "\\" + nomeDoVideo);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id(botaoSelecionarArquivoNaJanelaUploadFile)));
					WebElement El = driver.findElement(By.id(botaoSelecionarArquivoNaJanelaUploadFile));
					El.sendKeys(diretorioDoCurso + "\\" + codigoDoCurso + " " + nomeDoCurso + "\\" + nomeDoVideo);
					
					// ACIONA BOTÃO PARA FAZER O UPLOAD
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id(botaoUploadFileNaJanelaUploadFile)));
					driver.findElement(By.id(botaoUploadFileNaJanelaUploadFile)).click();
					System.out.print("[Copiando...]" + nomeDoVideo);
					
					// ESPERA O ARQUIVO SER COPIADO PARA CONTINUAR E PEGAR O PRÓXIMO
					wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(nomeDoVideo)));
					System.out.println(" - copiado;");
				}
			}
			driver.get(curso.getUrlPastasDoCurso());
		}
		return ConverteCursoParaXml.toXml(curso).replace("&", "&amp;");
	}
}
