
public class Negrito {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// RETIRA OS SINAIS DE MAIOR E MENOR PARA NÃO CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<font size='3'><strong>" + s + "</strong></font>";

			vai = vai + s + "\n";
		}
		
		return vai;
	}
}
