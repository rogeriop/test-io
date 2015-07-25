import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;


public class ParseClipBoardTest {
	

	@Test
	public void deveFormatarComoUmCodigo() throws IOException {
		
		String TextoDeTesteParaOpcao1 = new CenariosEResultadosEsperados().trasCenarioOpcao1();
		String ResultadoEsperadoParaOpcao1 = new CenariosEResultadosEsperados().trasResultadoOpcao1();

		String ResultadoGeradoParaOpcao1 = new Codigo().transforma(TextoDeTesteParaOpcao1);
		
		assertEquals(ResultadoEsperadoParaOpcao1, ResultadoGeradoParaOpcao1);

	}
}
