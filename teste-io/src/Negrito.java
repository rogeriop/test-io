public class Negrito {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<font size='3'><strong>" + linhas[0] + "</strong></font>";

		vai = vai + linhas[0] + "\n";

		return vai;
	}
}
