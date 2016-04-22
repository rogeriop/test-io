package transcreve;

import comum.Sumario;

public class SubTituloDeExercicioOuResposta {

	public String transforma(String linha) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linha = linha.replace("\"", "'");

		// PÕE ENDEREÇO PARA O TÍTULO
		vai = vai + "<a name='" + new Sumario(linha).getAncora() + "'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		linha = "<p><font size='5' color='gray'><strong>" + ((new Sumario(linha).getLetraAncora().equals("E")) ? "EX" : "R.EX") + new Sumario(linha).getNroAncora() + " - " + new Sumario(linha).getSubTitulo() + "</strong></font></p>";

		vai = vai + linha + "\n";

		vai = vai + "<p><font size='3'>&nbsp;</font></p>";

		return vai;

	}
}
