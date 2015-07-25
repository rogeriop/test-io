
public class Paragrafo {

	public String transforma(String vem) {

		// CRIA ARRAY DE LINHAS
		String[] linhas = vem.split("\n");

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD 
		String vai = "";
		
		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// ENDENTA��O DA LINHA
			s = new Endentacao(s).adiciona().getLinha();			
			
			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			
			s = "<p><font size='3'>" + s + "</font></p>";
			
			vai = vai + s + "\n";
		}
		
		return vai;

	}
	
}
