public class SubTitulo {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		String s = linhas[0];

		s = s.replace("\"", "'");

		// P�E ENDERE�O PARA O T�TULO
		vai = vai + "<a name='" + new Sumario(s).getAncora() + "'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		s = "<p><font size='5'><strong>" + new Sumario(s).getSubTitulo() + "</strong></font></p>";

		vai = vai + s + "\n";

		vai = vai + "<p><font size='3'>&nbsp;</font></p>";

		return vai;
	}


}
