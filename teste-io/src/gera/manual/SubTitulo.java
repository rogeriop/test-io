package gera.manual;

import comum.Sumario;
import comum.TransformaUmaLinha;

public class SubTitulo implements TransformaUmaLinha {

	public String transforma(String linha) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		String s = linha;

		s = s.replace("\"", "'");

		// PÕE ENDEREÇO PARA O TÍTULO
		vai = vai + "<a name='" + new Sumario(s).getAncora() + "'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		s = "<p><font size='5'><strong>" + new Sumario(s).getSubTitulo() + "</strong></font></p>";

		vai = vai + s + "\n";

		vai = vai + "<p><font size='3'>&nbsp;</font></p>";

		return vai;
	}


}
