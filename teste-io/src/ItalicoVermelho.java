public class ItalicoVermelho {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<font color='red'><em>" + linhas[0] + "</em></font>";

		vai = vai + linhas[0];

		return vai;
	}

}
