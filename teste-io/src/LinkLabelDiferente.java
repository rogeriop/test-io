
public class LinkLabelDiferente {

	public String transforma(String linha) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		linha = "<a class='LinkLabelDiferente' href='" + linha + "' target='_blank'><font size='3' color='blue'><em>**COLE-AQUI**</em></font></a>";

		vai = vai + linha;

		return vai;

	}
	
}
