package transcreve;

import comum.Endentacao;

public class Codigo {

	public String transforma(String[] linhas) {
		
		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD 
		String vai = "";
		
		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// ENDENTA��O DA LINHA
			s = new Endentacao(s).adiciona( ).getLinha();
			
			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='2' color='purple'><em><strong>" + s + "</strong></em></font></p>";
			
			vai = vai + s + "\n";
		}

		// CRIA UMA LINHA EM BRANCO AP�S O C�DIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>";

		return vai;

	}
}
