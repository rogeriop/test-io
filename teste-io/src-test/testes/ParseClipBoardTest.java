package testes;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import comum.Curso;
import comum.Licao;
import formata.FonteMaior;
import formata.FundoCinza;
import formata.ItalicoVermelho;
import formata.Negrito;
import formata.ParaListaNumerada;
import gera.manual.GeraEstruturaDeVideos;
import gera.manual.GeraEstruturaExercicios;
import gera.manual.GeraEstruturaSubTitulosExplicacao;
import gera.manual.IconeDiploma;
import gera.manual.IconeTecla;
import gera.manual.PaginaAulaCurso;
import gera.manual.PaginaIndiceCurso;
import gera.manual.XmlPadraoDoCurso;
import transcreve.Codigo;
import transcreve.Imagem;
import transcreve.LinkLabelDiferente;
import transcreve.LinkMesmoLabel;
import transcreve.ListaNumerada;
import transcreve.Paragrafo;
import transcreve.SubTituloDeExercicioOuResposta;
import transcreve.TranscreveSubTitulo;


public class ParseClipBoardTest {

	// PARA TODAS AS OPCOES QUE USAREM XML COMO ENTRADA
	
	// Opção  1-Código
	private static String[] TextoParaOTesteDaOpcao1;
	private static String ResultadoEsperadoDaOpcao1;

	// Opção  2-Parágrafo
	private static String[] TextoParaOTesteDaOpcao2;
	private static String ResultadoEsperadoDaOpcao2;
	
	// Opção  3-Lista Numerada
	private static String[] TextoParaOTesteDaOpcao3;
	private static String ResultadoEsperadoDaOpcao3;

	// Opção  4-SubTítulo Explicação
	private static String TextoParaOTesteDaOpcao4;
	private static String ResultadoEsperadoDaOpcao4;

	// Opção  5-Link (diferente do label)
	private static String TextoParaOTesteDaOpcao5;
	private static String ResultadoEsperadoDaOpcao5;

	// Opção  6-Negrito
	private static String[] TextoParaOTesteDaOpcao6;
	private static String ResultadoEsperadoDaOpcao6;

	// Opção  7-Imagem
	private static String[] TextoParaOTesteDaOpcao7;
	private static String ResultadoEsperadoDaOpcao7;

	// Opção  8-SubTítulo Exercício
	private static String TextoParaOTesteDaOpcao8;
	private static String ResultadoEsperadoDaOpcao8;

	// Opção  9-Fundo Cinza
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
	private static Curso curso14;
	private static Licao licao14;
	private static String ResultadoEsperadoDaOpcao14;

	// Opção 15-Icone Tela
	private static String TextoParaOTesteDaOpcao15;
	private static String ResultadoEsperadoDaOpcao15;

	// Opção 16-Icone Diploma
	private static String TextoParaOTesteDaOpcao16;
	private static String ResultadoEsperadoDaOpcao16;

	// Opção 17-Estrutura de sub-titulos da explicacao
	private static Curso curso17;
	private static Licao licao17;
	private static String ResultadoEsperadoDaOpcao17;

	// Opção 18-Página índice do curso
	private static Curso curso18;
	private static String ResultadoEsperadoDaOpcao18;

	// Opção 19-Página aula do curso
	private static Curso curso19;
	private static Licao licao19;
	private static String ResultadoEsperadoDaOpcao19;

	// Opção 22-XML do Curso
	private static Curso curso22;
	private static String ResultadoEsperadoDaOpcao22;

	// Sem Opção 100-Links do Vídeo de Pagina de Lição
	private static Curso curso100;
	private static Licao licao100;
	private static String ResultadoEsperadoSemOpcao100;

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
		TextoParaOTesteDaOpcao5 = opcao5.getCenario();
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
		CenariosEResultadosEsperados opcao14 = new CenariosEResultadosEsperados(true, "CursoNoFormatoXmlParaTeste.txt", "Opcao14ResultadoEsperado.txt");
		curso14 = opcao14.getCurso();
		List<Licao> licoes14 = curso14.getLicoes();
		licao14 = licoes14.get(0);
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
		CenariosEResultadosEsperados opcao17 = new CenariosEResultadosEsperados(true, "CursoNoFormatoXmlParaTeste.txt", "Opcao17ResultadoEsperado.txt");
		curso17 = opcao17.getCurso();
		List<Licao> licoes17 = curso17.getLicoes();
		licao17 = licoes17.get(0);
		ResultadoEsperadoDaOpcao17 = opcao17.getResultado();

		// Cenário e Resultado Esperado da Opção 18
		CenariosEResultadosEsperados opcao18 = new CenariosEResultadosEsperados(true, "Opcao18TextoParaTeste.txt", "Opcao18ResultadoEsperado.txt");
		curso18 = opcao18.getCurso();
		ResultadoEsperadoDaOpcao18 = opcao18.getResultado();

		// Cenário e Resultado Esperado da Opção 19
 		CenariosEResultadosEsperados opcao19 = new CenariosEResultadosEsperados(true, "CursoNoFormatoXmlParaTeste.txt", "Opcao19ResultadoEsperado.txt");
		curso19 = opcao19.getCurso();
		List<Licao> licoes19 = curso19.getLicoes();
		licao19 = licoes19.get(0);
		ResultadoEsperadoDaOpcao19 = opcao19.getResultado();

		// Cenário e Resultado Esperado da Opção 22
		CenariosEResultadosEsperados opcao22 = new CenariosEResultadosEsperados(null, "Opcao22ResultadoEsperado.txt");
		curso22 = new Curso("01", "Nome do Curso", "01/01/2016");
		ResultadoEsperadoDaOpcao22 = opcao22.getResultado();

		// Cenário e Resultado Esperado da Opção 100
 		CenariosEResultadosEsperados opcao100 = new CenariosEResultadosEsperados(true, "CursoNoFormatoXmlParaTeste.txt", "SemOpcao100ResultadoEsperado.txt");
		curso100 = opcao100.getCurso();
		List<Licao> licoes100 = curso100.getLicoes();
		licao100 = licoes100.get(0);
		ResultadoEsperadoSemOpcao100 = opcao100.getResultado();

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
		String ResultadoGerado = new TranscreveSubTitulo().transforma(TextoParaOTesteDaOpcao4);
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
		String ResultadoGerado = new GeraEstruturaExercicios().transforma(licao14);
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
		String ResultadoGerado = new GeraEstruturaSubTitulosExplicacao().transforma(licao17);
		assertEquals(ResultadoEsperadoDaOpcao17, ResultadoGerado);
	}

	@Test
	public void deveGerarPaginaIndiceDoCurso() {
		String ResultadoGerado = new PaginaIndiceCurso().transforma(curso18);
		assertEquals(ResultadoEsperadoDaOpcao18, ResultadoGerado);
	}

	@Test
	public void deveGerarPaginaAulaDoCurso() {
		String ResultadoGerado = new PaginaAulaCurso().transforma(curso19, licao19);
		assertEquals(ResultadoEsperadoDaOpcao19, ResultadoGerado);
	}

	@Test
	public void deveGerarXmlPadraoDoCurso() {
		String ResultadoGerado = new XmlPadraoDoCurso().transforma(curso22);
		assertEquals(ResultadoEsperadoDaOpcao22, ResultadoGerado);
	}

	@Test
	public void deveGerarLinksDeVideosNaPaginaAulaDoCurso() {
		String ResultadoGerado = new GeraEstruturaDeVideos().transforma(licao100);
		assertEquals(ResultadoEsperadoSemOpcao100, ResultadoGerado);
	}
	
}
