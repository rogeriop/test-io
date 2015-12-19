
public class IconeDiploma implements TransformaUmaLinha{

	@Override
	public String transforma(String linha) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String linhaAux = "";
		
		// TIRA O CONTEXTO DA URL
		linha = linha.replace("\"", "'");

		char charArray[] = linha.toCharArray();
		boolean copia = false;
		
		for (int x = 0; x <= charArray.length; x++) {
			if (copia == false &&
			   (charArray[x] == '/' && charArray[x + 1] == 's'
					                && charArray[x + 2] == 'h'
					                && charArray[x + 3] == 'a'
					                && charArray[x + 4] == 'r'
					                && charArray[x + 5] == 'e'))	{
				copia = true;
			}
			if (copia && charArray.length > x) {
				linhaAux = linhaAux + charArray[x];
			}

		}
		
		vai = vai + "<td>\n";

		vai = vai + "<a href='" + linhaAux + "' target='_blank'> ";
		
		vai = vai + "<img src='/share/proxy/alfresco/api/node/content/workspace/SpacesStore/9d87450c-2b01-425c-9477-fe8dd2f47216/Icon-diploma.jpg' alt='' width='90' height='137' />\n";

		vai = vai + "</td>\n" + "<!-- -->\n " ;

		return vai;
	}
	
	private void pegaSubTitulo() {


	}

}
