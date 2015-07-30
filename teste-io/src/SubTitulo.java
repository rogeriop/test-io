public class SubTitulo {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		String s = linhas[0];

		s = s.replace("\"", "'");

		// PÕE ENDEREÇO PARA O TÍTULO
		vai = vai + "<a name='" + pegaAncora(s) + "'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		s = "<p><font size='3'><strong>" + pegaSubTitulo(s) + "</strong></font></p>";

		vai = vai + s + "\n";

		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";

		return vai;
	}

	private String pegaAncora(String s) {

		String ancora = "";
		char charArray[] = s.toCharArray();
		int i = 0;
		boolean copia = false;
		for (int x=0; x <= charArray.length; x ++) {
			if (copia) {
				ancora = ancora + charArray[x];
				i++;
			}
			if (i == 3)
				break;
			if (charArray[x] == '#') {
				copia = true;
			}
		}

		return ancora;
	}

	private String pegaSubTitulo(String s) {

		String subTitulo = "";

		char charArray[] = s.toCharArray();
		boolean copia = false;
		for (int x = 0; x <= charArray.length; x++) {
			if (charArray[x] == 'm' && charArray[x + 1] == '>') {
				copia = true;
			}
			if (copia) {
				subTitulo = subTitulo + charArray[x + 2];
			}
			if (charArray[x + 3] == '<' && charArray[x + 4] == '/')
				break;
		}

		return subTitulo;

	}

}
