
public class LinkMesmoLabel {
	public String transforma(String[] linhas) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		linhas[0] = "<a href='" + linhas[0] + "' target='_blank'><font size='3' color='blue'><em>" + linhas[0] + "</em></font></a>";

		vai = vai + linhas[0];

		return vai;

	}

}
