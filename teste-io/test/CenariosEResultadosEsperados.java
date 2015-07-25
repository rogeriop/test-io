import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class CenariosEResultadosEsperados  {

	private String nomeArquivoTextoParaOTeste;
	private String nomeArquivoComResultadoEsperado;
	
	private String cenario = "";
	private String resultado = "";
	
	public CenariosEResultadosEsperados(String nomeArquivoTextoParaOTeste,	
			String nomeArquivoComResultadoEsperado) throws IOException {

		this.nomeArquivoTextoParaOTeste = nomeArquivoTextoParaOTeste;
		this.nomeArquivoComResultadoEsperado = nomeArquivoComResultadoEsperado;
		
		// Monta o texto para o teste
		Scanner sce = new Scanner(new FileInputStream(this.nomeArquivoTextoParaOTeste));
		while(sce.hasNextLine()) {
			this.cenario = this.cenario + sce.nextLine() + "\n";
		}

		// Monta Resultado Esperado
		Scanner scs = new Scanner(new FileInputStream(this.nomeArquivoComResultadoEsperado));
		while(scs.hasNextLine()) {
			this.resultado = this.resultado + scs.nextLine() + "\n";
		}

	}

	public String getCenario() {
		return this.cenario;
	}
	
	public String getResultado() {
		return this.resultado;
	}

}
