
public class ParaListaNumerada {
	public String transforma(String[] linhas) {
		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		// ADICIONA 1a. TAG DE UMA LISTA NUMERADA
		vai = vai + "<ol>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// TROCA PARAGRAFO POR LINHA DE UMA LISTA
			s = s.replace("<p>", "<li>");
			s = s.replace("</p>", "</li>");

			vai = vai + s + "\n";
		}

		// FECHA TAG DE UMA LISTA NUMERADA
		vai = vai + "</ol>" + "\n";

		return vai;
	}
}
