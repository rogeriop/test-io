package formata;
public class Negrito {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<strong>" + linhas[0] + "</strong>";

		vai = vai + linhas[0];

		return vai;
	}
}
