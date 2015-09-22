public class SubTituloDeExercicioOuResposta {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		String s = linhas[0];

		s = s.replace("\"", "'");

		// PÕE ENDEREÇO PARA O TÍTULO
		vai = vai + "<a name='" + new Sumario(s).getAncora() + "'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		s = "<p><font size='5'><strong>EX" + new Sumario(s).getNroAncora() + " - " + new Sumario(s).getSubTitulo() + "</strong></font></p>";

		vai = vai + s + "\n";

		vai = vai + "<p><font size='3'>&nbsp;</font></p>";

		return vai;

	}
}
