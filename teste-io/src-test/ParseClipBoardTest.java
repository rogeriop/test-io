import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;


public class ParseClipBoardTest {

	// Opção 1-Código
	private static String[] TextoParaOTesteDaOpcao1;
	private static String ResultadoEsperadoDaOpcao1;

	// Opção 2-Parágrafo
	private static String[] TextoParaOTesteDaOpcao2;
	private static String ResultadoEsperadoDaOpcao2;
	
	// Opção 3-Lista Numerada
	private static String[] TextoParaOTesteDaOpcao3;
	private static String ResultadoEsperadoDaOpcao3;

	// Opção 4-SubTítulo Explicação
	private static String[] TextoParaOTesteDaOpcao4;
	private static String ResultadoEsperadoDaOpcao4;

	// Opção 5-Link
	private static String[] TextoParaOTesteDaOpcao5;
	private static String ResultadoEsperadoDaOpcao5;

	// Opção 6-Negrito
	private static String[] TextoParaOTesteDaOpcao6;
	private static String ResultadoEsperadoDaOpcao6;

	// Opção 7-Imagem
	private static String[] TextoParaOTesteDaOpcao7;
	private static String ResultadoEsperadoDaOpcao7;

	// Opção 8-SubTítulo Exercício
	private static String[] TextoParaOTesteDaOpcao8;
	private static String ResultadoEsperadoDaOpcao8;

	// Opção 9-Fundo Cinza
	private static String TextoParaOTesteDaOpcao9;
	private static String ResultadoEsperadoDaOpcao9;

	// Opção 10-Lista Numerada
	private static String[] TextoParaOTesteDaOpcao10;
	private static String ResultadoEsperadoDaOpcao10;

	// Opção 11-Itálico Vermelho *6-Negrito
	private static String[] TextoParaOTesteDaOpcao11;
	private static String ResultadoEsperadoDaOpcao11;

	@BeforeClass
	public static void buscaCenariosEResultados() throws IOException {
		
		// Cenário e Resultado Esperado da Opção 1
		CenariosEResultadosEsperados opcao1 = new CenariosEResultadosEsperados("Opcao1TextoParaTeste.txt", "Opcao1ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao1 = opcao1.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao1 = opcao1.getResultado();

		// Cenário e Resultado Esperado da Opção 2
		CenariosEResultadosEsperados opcao2 = new CenariosEResultadosEsperados("Opcao2TextoParaTeste.txt", "Opcao2ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao2 = opcao2.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao2 = opcao2.getResultado();

		// Cenário e Resultado Esperado da Opção 3
		CenariosEResultadosEsperados opcao3 = new CenariosEResultadosEsperados("Opcao3TextoParaTeste.txt", "Opcao3ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao3 = opcao3.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao3 = opcao3.getResultado();
		
		// Cenário e Resultado Esperado da Opção 4
		CenariosEResultadosEsperados opcao4 = new CenariosEResultadosEsperados("Opcao4TextoParaTeste.txt", "Opcao4ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao4 = opcao4.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao4 = opcao4.getResultado();

		// Cenário e Resultado Esperado da Opção 5
		CenariosEResultadosEsperados opcao5 = new CenariosEResultadosEsperados("Opcao5TextoParaTeste.txt", "Opcao5ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao5 = opcao5.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao5 = opcao5.getResultado();

		// Cenário e Resultado Esperado da Opção 6
		CenariosEResultadosEsperados opcao6 = new CenariosEResultadosEsperados("Opcao6TextoParaTeste.txt", "Opcao6ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao6 = opcao6.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao6 = opcao6.getResultado();

		// Cenário e Resultado Esperado da Opção 7
		CenariosEResultadosEsperados opcao7 = new CenariosEResultadosEsperados("Opcao7TextoParaTeste.txt", "Opcao7ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao7 = opcao7.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao7 = opcao7.getResultado();

		// Cenário e Resultado Esperado da Opção 8
		CenariosEResultadosEsperados opcao8 = new CenariosEResultadosEsperados("Opcao8TextoParaTeste.txt", "Opcao8ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao8 = opcao8.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao8 = opcao8.getResultado();

		// Cenário e Resultado Esperado da Opção 9
		CenariosEResultadosEsperados opcao9 = new CenariosEResultadosEsperados("Opcao9TextoParaTeste.txt", "Opcao9ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao9 = opcao9.getCenario();
		ResultadoEsperadoDaOpcao9 = opcao9.getResultado();

		// Cenário e Resultado Esperado da Opção 10
		CenariosEResultadosEsperados opcao10 = new CenariosEResultadosEsperados("Opcao10TextoParaTeste.txt", "Opcao10ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao10 = opcao10.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao10 = opcao10.getResultado();

		// Cenário e Resultado Esperado da Opção 11
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
