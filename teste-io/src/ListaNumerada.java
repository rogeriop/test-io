
public class ListaNumerada {

	public String transforma(String vem){

		// RECEBE CONTEÚDO DO CLIPBOARD
		String[] linhas = vem.split("\n");

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD 
		String vai = "";
		
		// ADICIONA 1a. TAG DE UMA LISTA NUMERADA
		vai = vai + "<ol>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// ENDENTAÇÃO DA LINHA
//			s = new Endentacao(s).adiciona().getLinha();			
			
			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<li><font size='3'>" + s + "</font></li>";
			
			vai = vai + s + "\n";
		}

		// FECHA TAG DE UMA LISTA NUMERADA
		vai = vai + "</ol>" + "\n";
		
		return vai;
	}
}
