
public class Link {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<a href='" + s + "' target='_blank'><font size='3' color='blue'><em>**COLE-AQUI**</em></font></a>";

			vai = vai + s + "\n";
		}
		
		return vai;

	}
	
}
