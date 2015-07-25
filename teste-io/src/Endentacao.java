
public class Endentacao {

	private String linha;

	public Endentacao(String linha) {
		this.linha = linha;
	}
	
	public Endentacao adiciona() {

			// ADICIONA NA VARIÁVEL DE SAÍDA ENDENTAÇÃO DO PARÁGRAFO
			char charArray[] = linha.toCharArray();
			int i = 0;
			if (charArray.length > 0 && charArray[0] == ' ') {
				for (char c :charArray) {
					if (c != ' ') {
						break;
					} else {
						i++;
					}
				}
				for (int x = 0; x < i; x++) {
					linha = "&nbsp;" + linha;
				}
			}
			
			return this;

	}
	public String getLinha() {
		return this.linha;
	}
	
	
}