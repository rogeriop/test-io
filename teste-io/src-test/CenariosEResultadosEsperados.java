import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class CenariosEResultadosEsperados  {

	private String nomeArquivoTextoParaOTeste;
	private String nomeArquivoComResultadoEsperado;
	
	private String[] cenarioEmLinhas;
	private String cenario = "";
	private String resultado = "";
	
	public CenariosEResultadosEsperados(String nomeArquivoTextoParaOTeste,	
			String nomeArquivoComResultadoEsperado) throws IOException {

		boolean primeiro = true;

		this.nomeArquivoTextoParaOTeste = "esParaTestes/" + nomeArquivoTextoParaOTeste;
		this.nomeArquivoComResultadoEsperado = "esParaTestes/" + nomeArquivoComResultadoEsperado;
		
		// Monta o texto para o teste
		Scanner sce = new Scanner(new FileInputStream(this.nomeArquivoTextoParaOTeste));
		while(sce.hasNextLine()) {
			if(!primeiro) {
				this.cenario = this.cenario + "\n";
			}
			primeiro = false;

			this.cenario = this.cenario + sce.nextLine();
		}
		
		sce.close();
		
		// Quebra o cenario em linhas
		cenarioEmLinhas = cenario.split("\n");

		// Monta Resultado Esperado
		Scanner scs = new Scanner(new FileInputStream(this.nomeArquivoComResultadoEsperado));
		primeiro = true;
		while(scs.hasNextLine()) {
			if(!primeiro) {
				this.resultado = this.resultado + "\n";
			}
			primeiro = false;
			this.resultado = this.resultado + scs.nextLine();
		}
		
		scs.close();

	}

	public String getCenario() {
		return this.cenario;
	}
	
	public String[] getCenarioEmLinhas() {
		return this.cenarioEmLinhas;
	}
	
	public String getResultado() {
		return this.resultado;
	}

}
