import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;


public class ParseClipBoardTest {

	// Op��o 1-C�digo
	private static String[] TextoParaOTesteDaOpcao1;
	private static String ResultadoEsperadoDaOpcao1;

	// Op��o 2-Par�grafo
	private static String[] TextoParaOTesteDaOpcao2;
	private static String ResultadoEsperadoDaOpcao2;
	
	// Op��o 3-Lista Numerada
	private static String[] TextoParaOTesteDaOpcao3;
	private static String ResultadoEsperadoDaOpcao3;

	// Op��o 4-SubT�tulo Explica��o
	private static String[] TextoParaOTesteDaOpcao4;
	private static String ResultadoEsperadoDaOpcao4;

	// Op��o 5-Link
	private static String[] TextoParaOTesteDaOpcao5;
	private static String ResultadoEsperadoDaOpcao5;

	// Op��o 6-Negrito
	private static String[] TextoParaOTesteDaOpcao6;
	private static String ResultadoEsperadoDaOpcao6;

	// Op��o 7-Imagem
	private static String[] TextoParaOTesteDaOpcao7;
	private static String ResultadoEsperadoDaOpcao7;

	// Op��o 8-SubT�tulo Exerc�cio
	private static String[] TextoParaOTesteDaOpcao8;
	private static String ResultadoEsperadoDaOpcao8;

	// Op��o 9-Fundo Cinza
	private static String TextoParaOTesteDaOpcao9;
	private static String ResultadoEsperadoDaOpcao9;

	// Op��o 10-Lista Numerada
	private static String[] TextoParaOTesteDaOpcao10;
	private static String ResultadoEsperadoDaOpcao10;

	// Op��o 11-It�lico Vermelho *6-Negrito
	private static String[] TextoParaOTesteDaOpcao11;
	private static String ResultadoEsperadoDaOpcao11;

	@BeforeClass
	public static void buscaCenariosEResultados() throws IOException {
		
		// Cen�rio e Resultado Esperado da Op��o 1
		CenariosEResultadosEsperados opcao1 = new CenariosEResultadosEsperados("Opcao1TextoParaTeste.txt", "Opcao1ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao1 = opcao1.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao1 = opcao1.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 2
		CenariosEResultadosEsperados opcao2 = new CenariosEResultadosEsperados("Opcao2TextoParaTeste.txt", "Opcao2ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao2 = opcao2.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao2 = opcao2.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 3
		CenariosEResultadosEsperados opcao3 = new CenariosEResultadosEsperados("Opcao3TextoParaTeste.txt", "Opcao3ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao3 = opcao3.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao3 = opcao3.getResultado();
		
		// Cen�rio e Resultado Esperado da Op��o 4
		CenariosEResultadosEsperados opcao4 = new CenariosEResultadosEsperados("Opcao4TextoParaTeste.txt", "Opcao4ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao4 = opcao4.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao4 = opcao4.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 5
		CenariosEResultadosEsperados opcao5 = new CenariosEResultadosEsperados("Opcao5TextoParaTeste.txt", "Opcao5ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao5 = opcao5.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao5 = opcao5.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 6
		CenariosEResultadosEsperados opcao6 = new CenariosEResultadosEsperados("Opcao6TextoParaTeste.txt", "Opcao6ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao6 = opcao6.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao6 = opcao6.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 7
		CenariosEResultadosEsperados opcao7 = new CenariosEResultadosEsperados("Opcao7TextoParaTeste.txt", "Opcao7ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao7 = opcao7.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao7 = opcao7.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 8
		CenariosEResultadosEsperados opcao8 = new CenariosEResultadosEsperados("Opcao8TextoParaTeste.txt", "Opcao8ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao8 = opcao8.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao8 = opcao8.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 9
		CenariosEResultadosEsperados opcao9 = new CenariosEResultadosEsperados("Opcao9TextoParaTeste.txt", "Opcao9ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao9 = opcao9.getCenario();
		ResultadoEsperadoDaOpcao9 = opcao9.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 10
		CenariosEResultadosEsperados opcao10 = new CenariosEResultadosEsperados("Opcao10TextoParaTeste.txt", "Opcao10ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao10 = opcao10.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao10 = opcao10.getResultado();

		// Cen�rio e Resultado Esperado da Op��o 11
		CenariosEResultadosEsperados opcao11 = new CenariosEResultadosEsperados("Opcao11TextoParaTeste.txt", "Opcao11ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao11 = opcao11.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao11 = opcao11.getResultado();

	}
	
	@Test
	public void deveFormatarComoUmCodigo() {
		
		String ResultadoGerado = new Codigo().transforma(TextoParaOTesteDaOpcao1);
		
		assertEquals(ResultadoEsperadoDaOpcao1, ResultadoGerado);

	}

	@Test
	public void deveFormatarComoUmParagrafo() {
		
		String ResultadoGerado = new Paragrafo().transforma(TextoParaOTesteDaOpcao2);
		
		assertEquals(ResultadoEsperadoDaOpcao2, ResultadoGerado);

	}

	@Test
	public void deveFormatarComoUmaListaNumerada() {
		
		String ResultadoGerado = new ListaNumerada().transforma(TextoParaOTesteDaOpcao3);
		
		assertEquals(ResultadoEsperadoDaOpcao3, ResultadoGerado);

	}

	@Test
	public void deveFormatarComoUmSubtitulo() {
		
		String ResultadoGerado = new SubTitulo().transforma(TextoParaOTesteDaOpcao4);
		
		assertEquals(ResultadoEsperadoDaOpcao4, ResultadoGerado);

	}

	@Test
	public void deveFormatarComoUmLink() {
		
		String ResultadoGerado = new Link().transforma(TextoParaOTesteDaOpcao5);
		
		assertEquals(ResultadoEsperadoDaOpcao5, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarComoUmNegrito() {
		
		String ResultadoGerado = new Negrito().transforma(TextoParaOTesteDaOpcao6);
		
		assertEquals(ResultadoEsperadoDaOpcao6, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarComoUmaImagem() {
		
		String ResultadoGerado = new Imagem().transforma(TextoParaOTesteDaOpcao7, 307, 72);
		
		assertEquals(ResultadoEsperadoDaOpcao7, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarComoUmSubTituloDeExercicioOuResposta() {
		
		String ResultadoGerado = new SubTituloDeExercicioOuResposta().transforma(TextoParaOTesteDaOpcao8);
		
		assertEquals(ResultadoEsperadoDaOpcao8, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarColocandoFundoCinza() {
		
		String ResultadoGerado = new FundoCinza().tranforma(TextoParaOTesteDaOpcao9);
		
		assertEquals(ResultadoEsperadoDaOpcao9, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarColocandoEmListaNumerada() {
		
		String ResultadoGerado = new ParaListaNumerada().transforma(TextoParaOTesteDaOpcao10);
		
		assertEquals(ResultadoEsperadoDaOpcao10, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarComoUmItalicoVermelho() {
		
		String ResultadoGerado = new ItalicoVermelho().transforma(TextoParaOTesteDaOpcao11);
		
		assertEquals(ResultadoEsperadoDaOpcao11, ResultadoGerado);
		
	}

}
