package gera.manual;

import comum.TransformaLinhas;
import transcreve.SubTitulo;

public class EstruturaSubTitulosExplicacao implements TransformaLinhas {
	
	@Override
	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String linksSubTitulosExplicacoes = "";
		String subTitulosExplicacoes = "";

		// CONSTROI BLOCO linksSubTitulosExplicacoes
		vai = vai + "<!-- Links Explicacoes -->\n" + "<ol>\n";
		linksSubTitulosExplicacoes = constroiConteudoLinks(linhas, "B", 0);
		vai = vai + linksSubTitulosExplicacoes + "</ol>\n";
		
		//CONSTROI BLOCO subTitulosExplicacoes
		vai = vai + "<!-- Sub-Titulos Explicacoes -->" + "\n";
		subTitulosExplicacoes = constroiConteudoTitulos(linksSubTitulosExplicacoes, 0);
		vai = vai + subTitulosExplicacoes;

		return vai + "<!-- FIM -->\n ";
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

	// CONSTROI LINHAS DO BLOCO subTitulosExplicacoes
	private String constroiConteudoTitulos(String conteudo, int contadorDeLinhas) {

		String auxTitulosExercicios = "";
		String[] linhas = conteudo.split("\n");

		for (String s : linhas) {
			auxTitulosExercicios = auxTitulosExercicios + new SubTitulo().transforma(s) + "\n";
			auxTitulosExercicios = auxTitulosExercicios + "<p>***********************************</p>\n";
		}
	
		return auxTitulosExercicios;
	}
	

}
