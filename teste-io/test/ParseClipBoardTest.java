import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;


public class ParseClipBoardTest {

	// Opção 1-Código
	private static String TextoParaOTesteDaOpcao1;
	private static String ResultadoEsperadoDaOpcao1;

	// Opção 2-Parágrafo
	private static String TextoParaOTesteDaOpcao2;
	private static String ResultadoEsperadoDaOpcao2;
	
	// Opção 3-Lista Numerada
	private static String TextoParaOTesteDaOpcao3;
	private static String ResultadoEsperadoDaOpcao3;

	@BeforeClass
	public static void buscaCenariosEResultados() throws IOException {
		
		// Cenário e Resultado Esperado da Opção 1
		CenariosEResultadosEsperados opcao1 = new CenariosEResultadosEsperados("Opcao1TextoParaTeste.txt", "Opcao1ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao1 = opcao1.getCenario();
		ResultadoEsperadoDaOpcao1 = opcao1.getResultado();

		// Cenário e Resultado Esperado da Opção 2
		CenariosEResultadosEsperados opcao2 = new CenariosEResultadosEsperados("Opcao2TextoParaTeste.txt", "Opcao2ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao2 = opcao2.getCenario();
		ResultadoEsperadoDaOpcao2 = opcao2.getResultado();

		// Cenário e Resultado Esperado da Opção 3
		CenariosEResultadosEsperados opcao3 = new CenariosEResultadosEsperados("Opcao3TextoParaTeste.txt", "Opcao3ResultadoEsperado.txt");
		TextoParaOTesteDaOpcao3 = opcao3.getCenario();
		ResultadoEsperadoDaOpcao3 = opcao3.getResultado();
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

}
