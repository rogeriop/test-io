package comum;

import java.util.List;

public class PaginaDaLicaoExercicios {
	List<String> titulos;
	String listaOlDeTitulosExercicios = "";
	String listaOlDeTitulosRespostasExercicios = "";
	String titulosExercicios = "";
	String titulosRespostasExercicios = "";
	String estruturaDeExerciciosCompleta = "";

	public PaginaDaLicaoExercicios(Licao licao) {
		this.titulos = licao.getTitulosExercicios();
		carregaDemaisVariaveisDeInstancia();
	}

	public String getListaOlDeTitulosExercicios() {
		return listaOlDeTitulosExercicios;
	}

	public String getListaOlDeTitulosRespostasExercicios() {
		return listaOlDeTitulosRespostasExercicios;
	}

	public String getTitulosExercicios() {
		return titulosExercicios;
	}

	public String getTitulosRespostasExercicios() {
		return titulosRespostasExercicios;
	}

	public String getEstruturaDeExerciciosCompleta() {
		return estruturaDeExerciciosCompleta;
	}

	public void carregaDemaisVariaveisDeInstancia() {
		listaOlDeTitulosExercicios = "<!-- Links Exercicios -->\n" + "<ol>\n";
		listaOlDeTitulosExercicios += constroiConteudoLinks(titulos, "E", 0) + "</ol>\n";

		listaOlDeTitulosRespostasExercicios = "<!-- Links Respostas Exercicios -->\n" + "<ol>\n";
		listaOlDeTitulosRespostasExercicios += constroiConteudoLinks(titulos, "R", 0) + "</ol>\n";

		titulosExercicios = "<!-- Titulos Exercicios -->" + "\n";
		titulosExercicios += constroiConteudoTitulos(listaOlDeTitulosExercicios, 0);

		titulosRespostasExercicios = "<!-- Titulos Respostas Exercicios -->" + "\n";
		titulosRespostasExercicios += constroiConteudoTitulos(listaOlDeTitulosRespostasExercicios, 0);

		estruturaDeExerciciosCompleta = listaOlDeTitulosExercicios + listaOlDeTitulosRespostasExercicios
				+ titulosExercicios + titulosRespostasExercicios;
	}

	private String constroiConteudoLinks(List<String> linhas, String tipo, int contadorDeLinhas) {
		String conteudo = "";

		for (String s : linhas) {
			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			contadorDeLinhas++;
			s = "<li><a href='#" + tipo + ((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas
					+ "'><font size='3' color='blue'><em>" + s + "</em></font></a></li>";
			conteudo = conteudo + s + "\n";
		}
		return conteudo;
	}

	private String constroiConteudoTitulos(String conteudo, int contadorDeLinhas) {
		String auxTitulosExercicios = "";
		String[] linhas = conteudo.split("\n");

		for (String s : linhas) {
			if (s.substring(0, 4).equals("<li>")) {
				auxTitulosExercicios = auxTitulosExercicios + geraSubTituloDeExercicioOuResposta(s) + "\n";
				auxTitulosExercicios = auxTitulosExercicios + "<p>***********************************</p>\n";
			}
		}
		return auxTitulosExercicios;
	}

	public static String geraSubTituloDeExercicioOuResposta(String linha) {
		String vai = "";
		linha = linha.replace("\"", "'");

		// PÕE ENDEREÇO PARA O TÍTULO
		vai += "<a name='" + new Sumario(linha).getAncora() + "'></a>" + "\n";
		vai += "<p><font size='3'>&nbsp;</font></p>" + "\n";

		linha = "<p><font size='5' color='gray'><strong>"
				+ ((new Sumario(linha).getLetraAncora().equals("E")) ? "EX" : "R.EX")
				+ new Sumario(linha).getNroAncora() + " - " + new Sumario(linha).getSubTitulo()
				+ "</strong></font></p>";

		vai += linha + "\n";

		vai += "<p><font size='3'>&nbsp;</font></p>";

		return vai;

	}
}
