package formata;
public class Negrito {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<strong>" + linhas[0] + "</strong>";

		vai = vai + linhas[0];

		return vai;
	}
}
