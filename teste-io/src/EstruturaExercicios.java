
public class EstruturaExercicios implements Transforma{

	@Override
	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String linksExercicios = "";
		String linksRespostasExercicios = "";
		String titulosExercicios = "";
		String titulosRespostasExercicios = "";

		// CONSTROI BLOCO linksExercicios
		vai = vai + "<!-- Links Exercicios -->\n" + "<ol>\n";
		linksExercicios = constroiConteudoLinks(linhas, "E", 0);
		vai = vai + linksExercicios + "</ol>\n";
		
		// CONSTROI BLOCO linksRespostasExercicios
		vai = vai + "<!-- Links Respostas Exercicios -->\n" + "<ol>\n";
		linksRespostasExercicios = constroiConteudoLinks(linhas, "R", 0);
		vai = vai + linksRespostasExercicios + "</ol>\n";
		
		//CONSTROI BLOCO titulosExercicios
		vai = vai + "<!-- Titulos Exercicios -->" + "\n";
		titulosExercicios = constroiConteudoTitulos(linksExercicios, 0);
		vai = vai + titulosExercicios;
		
		//CONSTROI BLOCO titulosExercicios
		vai = vai + "<!-- Titulos Respostas Exercicios -->" + "\n";
		titulosRespostasExercicios = constroiConteudoTitulos(linksRespostasExercicios, 0);
		vai = vai + titulosRespostasExercicios;

		return vai + "<!-- FIM -->";
	}

	
	// CONSTROI LINHAS DO BLOCO links
	private String constroiConteudoLinks(String[] linhas, String tipo, int contadorDeLinhas) {

		String conteudo = "";

		for (String s : linhas) {
			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			contadorDeLinhas++;
			s = "<li><a href='#" + tipo + ((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas + "'><font size='3' color='blue'><em>" + s + "</em></font></a></li>";
			conteudo = conteudo + s + "\n";
		}
		
		return conteudo;
	}

	// CONSTROI LINHAS DO BLOCO titulos
	private String constroiConteudoTitulos(String conteudo, int contadorDeLinhas) {

		String auxTitulosExercicios = "";
		String[] linhas = conteudo.split("\n");

		for (String s : linhas) {
			auxTitulosExercicios = auxTitulosExercicios + new SubTituloDeExercicioOuResposta().transforma(s) + "\n";
			auxTitulosExercicios = auxTitulosExercicios + "***********************************\n";
		}
	
		return auxTitulosExercicios;
	}

}
