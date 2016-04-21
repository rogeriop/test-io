package transcreve;
public class ListaNumerada {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		// ADICIONA 1a. TAG DE UMA LISTA NUMERADA
		vai = vai + "<ol>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			// Elimina linhas em branco da lista numerada
			if (!s.equals("")) {
				s = "<li><font size='3'>" + s + "</font></li>";
				vai = vai + s + "\n";
			}
		}

		// FECHA TAG DE UMA LISTA NUMERADA
		vai = vai + "</ol>" + "\n";

		// CRIA UMA LINHA EM BRANCO APÓS O CÓDIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>";

		return vai;
	}

}
