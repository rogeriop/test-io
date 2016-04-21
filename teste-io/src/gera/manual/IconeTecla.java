package gera.manual;

import comum.TransformaUmaLinha;

public class IconeTecla implements TransformaUmaLinha{

	@Override
	public String transforma(String linha) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		linha = linha.replace("\"", "'");

		vai = vai + "<td align='center'>\n";
		
		vai = vai + "<a href='" + linha + "' target='_blank'> ";
		
		vai = vai + "<img src='/share/proxy/alfresco/api/node/content/workspace/SpacesStore/cf6b3ac2-f109-4f57-855e-22b07b04a1b0/diplomaTecla.jpg' alt='' width='30' height='30' /></a>\n";

		vai = vai + "</td>\n" + "<!-- -->" ;

		return vai;

	}

}
