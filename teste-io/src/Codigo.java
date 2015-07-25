
public class Codigo {

	public String transforma(String vem) {
		ClipBoard clipBoard = new ClipBoard();
		
		// CRIA ARRAY DE LINHAS
		String[] linhas = vem.split("\n");

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD 
		String vai = "";
		
		// CRIA UMA LINHA EM BRANCO ANTES DO C�DIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// ENDENTA��O DA LINHA
			s = new Endentacao(s).adiciona();
			
			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='2' color='purple'><em><strong>" + s + "</strong></em></font></p>";
			
			vai = vai + s + "\n";
		}

		// CRIA UMA LINHA EM BRANCO AP�S O C�DIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";

		// GRAVA TRATAMENTO DO TEXTO NO CLIBOARD
		clipBoard.copia(vai);

		return vai;

	}
}
