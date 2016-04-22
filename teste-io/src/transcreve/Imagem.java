package transcreve;
public class Imagem {

	public String transforma(String[] linhas, int width, int height) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		String s = linhas[0];

		// RETIRA O ENDEREÇO
		s = s.replace("http://10.0.0.115:8080", "");

		s = "<p><font size='3'><img src='" + s + "' alt='' width='" + width
				+ "' height='" + height + "' />&nbsp;</font></p>";
		vai = vai + s + "\n";

		// CRIA UMA LINHA EM BRANCO APÓS A IMAGEM
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>";

		return vai;

	}
}
