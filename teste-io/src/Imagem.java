
public class Imagem {

	public String transforma(String[] linhas, int width, int height) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			
			//RETIRA O ENDERE�O
			s = s.replace("http://10.0.0.115:8080", "");

			s = "<p><font size='3'><img src='" + s + "' alt='' width='" + width + "' height='" + height + "' />&nbsp;</font></p>";
			vai = vai + s + "\n";
		}

		// CRIA UMA LINHA EM BRANCO AP�S A IMAGEM
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";

		return vai;

	}
}
