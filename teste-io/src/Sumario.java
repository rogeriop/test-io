
public class Sumario {

	private String s;
	private String ancora = "";
	private String subTitulo = "";
	private int nroAncora = 0;
	
	public Sumario(String s) {
		this.s = s;
		pegaAncora();
		pegaSubTitulo();
		nroAncora = Integer.parseInt(ancora.substring(1));
	}
	
	private void pegaAncora() {

		char charArray[] = s.toCharArray();
		int i = 0;
		boolean copiaAncora = false;
		for (int x=0; x <= charArray.length; x ++) {
			if (copiaAncora) {
				ancora = ancora + charArray[x];
				i++;
			}
			if (i == 3)
				break;
			if (charArray[x] == '#') {
				copiaAncora = true;
			}
		}
	}

	private void pegaSubTitulo() {

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

	}

	public String getAncora() {
		return ancora;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public int getNroAncora() {
		return nroAncora;
	}

}
