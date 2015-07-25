
public class Codigo {

	public String transforma(String vem) {
		ClipBoard clipBoard = new ClipBoard();
		
		// CRIA ARRAY DE LINHAS
		String[] linhas = vem.split("\n");

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD 
		String vai = "";
		
		// CRIA UMA LINHA EM BRANCO ANTES DO CÓDIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// ENDENTAÇÃO DA LINHA
			s = new Endentacao(s).adiciona();
			
			// RETIRA OS SINAIS DE MAIOR E MENOR PARA NÃO CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='2' color='purple'><em><strong>" + s + "</strong></em></font></p>";
			
			vai = vai + s + "\n";
		}

		// CRIA UMA LINHA EM BRANCO APÓS O CÓDIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";

		// GRAVA TRATAMENTO DO TEXTO NO CLIBOARD
		clipBoard.copia(vai);

		return vai;

	}
}
