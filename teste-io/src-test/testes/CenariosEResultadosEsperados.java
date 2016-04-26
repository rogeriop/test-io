package testes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import comum.ConverteXmlParaCurso;
import comum.Curso;


public class CenariosEResultadosEsperados  {

	private String nomeArquivoTextoParaOTeste;
	private String nomeArquivoComResultadoEsperado;
	
	private String[] cenarioEmLinhas;
	private String cenario = "";
	private String resultado = "";

	private Curso curso;
	
	public CenariosEResultadosEsperados(String nomeArquivoTextoParaOTeste,	
			String nomeArquivoComResultadoEsperado) throws IOException {


		this.nomeArquivoTextoParaOTeste = "esParaTestes/" + nomeArquivoTextoParaOTeste;
		this.nomeArquivoComResultadoEsperado = "esParaTestes/" + nomeArquivoComResultadoEsperado;
		
		if (nomeArquivoTextoParaOTeste != null) montaTextoParaOTeste();

		montaTextoDoResultadoEsperado();

	}

	public CenariosEResultadosEsperados(boolean textoParaOTesteEhXml, String nomeArquivoTextoParaOTeste,	
			String nomeArquivoComResultadoEsperado) throws IOException {


		this.nomeArquivoTextoParaOTeste = "esParaTestes/" + nomeArquivoTextoParaOTeste;
		this.nomeArquivoComResultadoEsperado = "esParaTestes/" + nomeArquivoComResultadoEsperado;
		
		if (nomeArquivoTextoParaOTeste != null) {
			montaTextoParaOTeste();
			this.curso = ConverteXmlParaCurso.cursoDeXml(cenario);
		}

		montaTextoDoResultadoEsperado();

	}


	private void montaTextoDoResultadoEsperado() throws FileNotFoundException {
		// Monta Resultado Esperado
		Scanner scs = new Scanner(new FileInputStream(this.nomeArquivoComResultadoEsperado));
		boolean primeiro = true;
		while(scs.hasNextLine()) {
			if(!primeiro) {
				this.resultado = this.resultado + "\n";
			}
			primeiro = false;
			this.resultado = this.resultado + scs.nextLine();
		}
		
		scs.close();
	}

	private void montaTextoParaOTeste() throws FileNotFoundException {
		boolean primeiro = true;

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

	public Curso getCurso() {
		return this.curso;
	}

}
