package transcreve;

import comum.Endentacao;

public class Codigo {

	public String transforma(String[] linhas) {
		
		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD 
		String vai = "";
		
		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// ENDENTAÇÃO DA LINHA
			s = new Endentacao(s).adiciona( ).getLinha();
			
			// RETIRA OS SINAIS DE MAIOR E MENOR PARA NÃO CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='2' color='purple'><em><strong>" + s + "</strong></em></font></p>";
			
			vai = vai + s + "\n";
		}

		// CRIA UMA LINHA EM BRANCO APÓS O CÓDIGO
		vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>";

		return vai;

	}
}
