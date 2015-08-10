
public class Link {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<a href='" + linhas[0] + "' target='_blank'><font size='3' color='blue'><em>**COLE-AQUI**</em></font></a>";

		vai = vai + linhas[0];

		return vai;

	}
	
}
