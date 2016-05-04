package comum;

import java.util.List;

public class SubTitulosExplicacoes {
	private List<String> subTitulos;
	private String listaOlDeSubTitulosExplicacoes;
	private String subTitulosExplicacoes = "";
	private String umSubTituloExplicacao;
	private String umLiDeSubTituloExplicacao;
	
	public SubTitulosExplicacoes(Licao licao) {
		this.subTitulos = licao.getSubTitulosDaExplicacao();
		geraListaOlDeSubTitulosExplicacoes();
		geraSubTitulosExplicacoes();
	}

	public SubTitulosExplicacoes(String umLiDeSubTituloExplicacao) {
		this.umLiDeSubTituloExplicacao = umLiDeSubTituloExplicacao;
		geraUmSubTituloExplicacao();
	}

	public String getLinksSubTitulosExplicacoes() {
		return listaOlDeSubTitulosExplicacoes;
	}

	public String getSubTitulosExplicacoes() {
		return subTitulosExplicacoes;
	}

	public String getUmSubTituloExplicacao() {
		return umSubTituloExplicacao;
	}

	private void geraListaOlDeSubTitulosExplicacoes() {
		int contadorDeLinhas = 0;
		String numeroExercicioComDoisDigitos = "";

		listaOlDeSubTitulosExplicacoes = "<!-- Links Explicacoes -->\n" + "<ol>\n";
		for (String subTitulo : subTitulos) {
			subTitulo = subTitulo.replace("<", "&lt;");
			subTitulo = subTitulo.replace(">", "&gt;");
			contadorDeLinhas++;
			numeroExercicioComDoisDigitos = ((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas;
			subTitulo = "<li><a href='#B" + numeroExercicioComDoisDigitos + "'><font size='3' color='blue'><em>" + subTitulo + "</em></font></a></li>";
			listaOlDeSubTitulosExplicacoes += subTitulo + "\n";
		}
		listaOlDeSubTitulosExplicacoes += "</ol>\n";
	}

	private void geraSubTitulosExplicacoes() {
		String[] linhas = listaOlDeSubTitulosExplicacoes.split("\n");

		for (String s : linhas) {
			if (s.substring(0, 4).equals("<li>")) {
				umLiDeSubTituloExplicacao = s;
				geraUmSubTituloExplicacao();
				subTitulosExplicacoes += this.umSubTituloExplicacao;
				subTitulosExplicacoes += "<p>***********************************</p>\n";
			}
		}
	}
	
	private void geraUmSubTituloExplicacao() {
		umLiDeSubTituloExplicacao = umLiDeSubTituloExplicacao.replace("\"", "'");
		umSubTituloExplicacao = "<a name='" + new Sumario(umLiDeSubTituloExplicacao).getAncora() + "'></a>" + "\n";
		umSubTituloExplicacao += "<p><font size='3'>&nbsp;</font></p>" + "\n";
		umLiDeSubTituloExplicacao = "<p><font size='5'><strong>" + new Sumario(umLiDeSubTituloExplicacao).getSubTitulo() + "</strong></font></p>";
		umSubTituloExplicacao += umLiDeSubTituloExplicacao + "\n";
		umSubTituloExplicacao += "<p><font size='3'>&nbsp;</font></p>\n";
	}
	
}
