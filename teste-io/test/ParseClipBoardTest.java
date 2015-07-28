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

	// Op��o 4-SubT�tulo
	private static String[] TextoParaOTesteDaOpcao4;
	private static String ResultadoEsperadoDaOpcao4;

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

}
