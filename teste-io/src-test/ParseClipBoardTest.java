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
	private static String TextoParaOTesteDaOpcao4;
	private static String ResultadoEsperadoDaOpcao4;

	// Opção 5-Link (diferente do label)
	private static String[] TextoParaOTesteDaOpcao5;
	private static String ResultadoEsperadoDaOpcao5;

	// Opção 6-Negrito
	private static String[] TextoParaOTesteDaOpcao6;
	private static String ResultadoEsperadoDaOpcao6;

	// Opção 7-Imagem
	private static String[] TextoParaOTesteDaOpcao7;
	private static String ResultadoEsperadoDaOpcao7;

	// Opção 8-SubTítulo Exercício
	private static String TextoParaOTesteDaOpcao8;
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

	// Opção 12-Fonte Maior
	private static String[] TextoParaOTesteDaOpcao12;
	private static String ResultadoEsperadoDaOpcao12;

	// Opção 13-Link (mesmo que o label)
	private static String[] TextoParaOTesteDaOpcao13;
	private static String ResultadoEsperadoDaOpcao13;

	// Opção 14-Estrutura de exercicios
	private static String[] TextoParaOTesteDaOpcao14;
	private static String ResultadoEsperadoDaOpcao14;

	// Opção 15-Icone Tela
	private static String TextoParaOTesteDaOpcao15;
	private static String ResultadoEsperadoDaOpcao15;

	// Opção 16-Icone Diploma
	private static String TextoParaOTesteDaOpcao16;
	private static String ResultadoEsperadoDaOpcao16;

	// Opção 17-Estrutura de sub-titulos da explicacao
	private static String[] TextoParaOTesteDaOpcao17;
	private static String ResultadoEsperadoDaOpcao17;

	// Opção 18-Página índice do curso
	private static String[] TextoParaOTesteDaOpcao18;
	private static String ResultadoEsperadoDaOpcao18;

	// Opção 19-Página aula do curso
	private static String TextoParaOTesteDaOpcao19;
	private static String ResultadoEsperadoDaOpcao19;

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
		TextoParaOTesteDaOpcao4 = opcao4.getCenario();
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
		TextoParaOTesteDaOpcao8 = opcao8.getCenario();
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

		// Cenário e Resultado Esperado da Opção 12
		CenariosEResultadosEsperados opcao12 = new CenariosEResultadosEsperados("Opcao12TextoParaTeste.txt", "Opcao12ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao12 = opcao12.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao12 = opcao12.getResultado();

		// Cenário e Resultado Esperado da Opção 13
		CenariosEResultadosEsperados opcao13 = new CenariosEResultadosEsperados("Opcao13TextoParaTeste.txt", "Opcao13ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao13 = opcao13.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao13 = opcao13.getResultado();

		// Cenário e Resultado Esperado da Opção 14
		CenariosEResultadosEsperados opcao14 = new CenariosEResultadosEsperados("Opcao14TextoParaTeste.txt", "Opcao14ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao14 = opcao14.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao14 = opcao14.getResultado();

		// Cenário e Resultado Esperado da Opção 15
		CenariosEResultadosEsperados opcao15 = new CenariosEResultadosEsperados("Opcao15TextoParaTeste.txt", "Opcao15ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao15 = opcao15.getCenario();
		ResultadoEsperadoDaOpcao15 = opcao15.getResultado();

		// Cenário e Resultado Esperado da Opção 16
		CenariosEResultadosEsperados opcao16 = new CenariosEResultadosEsperados("Opcao16TextoParaTeste.txt", "Opcao16ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao16 = opcao16.getCenario();
		ResultadoEsperadoDaOpcao16 = opcao16.getResultado();

		// Cenário e Resultado Esperado da Opção 17
		CenariosEResultadosEsperados opcao17 = new CenariosEResultadosEsperados("Opcao17TextoParaTeste.txt", "Opcao17ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao17 = opcao17.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao17 = opcao17.getResultado();

		// Cenário e Resultado Esperado da Opção 18
		CenariosEResultadosEsperados opcao18 = new CenariosEResultadosEsperados("Opcao18TextoParaTeste.txt", "Opcao18ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao18 = opcao18.getCenarioEmLinhas();
		ResultadoEsperadoDaOpcao18 = opcao18.getResultado();

		// Cenário e Resultado Esperado da Opção 19
		CenariosEResultadosEsperados opcao19 = new CenariosEResultadosEsperados("Opcao19TextoParaTeste.txt", "Opcao19ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao19 = opcao19.getCenario();
		ResultadoEsperadoDaOpcao19 = opcao19.getResultado();

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
	public void deveFormatarComoUmLinkDeLabelDiferente() {
		
		String ResultadoGerado = new LinkLabelDiferente().transforma(TextoParaOTesteDaOpcao5);
		
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

	@Test
	public void deveFormatarComUmaFonteMaior() {
		
		String ResultadoGerado = new FonteMaior().transforma(TextoParaOTesteDaOpcao12);
		
		assertEquals(ResultadoEsperadoDaOpcao12, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarComoUmLinkDeMesmoLabel() {
		
		String ResultadoGerado = new LinkMesmoLabel().transforma(TextoParaOTesteDaOpcao13);
		
		assertEquals(ResultadoEsperadoDaOpcao13, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarAEstruturaDeExercicios() {
		
		String ResultadoGerado = new EstruturaExercicios().transforma(TextoParaOTesteDaOpcao14);
		
		assertEquals(ResultadoEsperadoDaOpcao14, ResultadoGerado);
		
	}

	@Test
	public void deveGerarIconeTecla() {
		
		String ResultadoGerado = new IconeTecla().transforma(TextoParaOTesteDaOpcao15);
		
		assertEquals(ResultadoEsperadoDaOpcao15, ResultadoGerado);
		
	}

	@Test
	public void deveGerarIconeDiploma() {
		
		String ResultadoGerado = new IconeDiploma().transforma(TextoParaOTesteDaOpcao16);
		
		assertEquals(ResultadoEsperadoDaOpcao16, ResultadoGerado);
		
	}

	@Test
	public void deveFormatarAEstruturaDeSubTitulosExplicacao() {
		
		String ResultadoGerado = new EstruturaSubTitulosExplicacao().transforma(TextoParaOTesteDaOpcao17);
		
		assertEquals(ResultadoEsperadoDaOpcao17, ResultadoGerado);
		
	}

	@Test
	public void deveGerarPaginaIndiceDoCurso() {
		
		String ResultadoGerado = new PaginaIndiceCurso().transforma(TextoParaOTesteDaOpcao18);
		
		assertEquals(ResultadoEsperadoDaOpcao18, ResultadoGerado);
		
	}

	@Test
	public void deveGerarPaginaAulaDoCurso() {
		
		String ResultadoGerado = new PaginaAulaCurso().transforma(TextoParaOTesteDaOpcao19);
		
		assertEquals(ResultadoEsperadoDaOpcao19, ResultadoGerado);
		
	}

}
