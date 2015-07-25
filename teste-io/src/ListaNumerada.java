
public class ListaNumerada {

	public String transforma(String vem){

		// RECEBE CONTE�DO DO CLIPBOARD
		String[] linhas = vem.split("\n");

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD 
		String vai = "";
		
		// ADICIONA 1a. TAG DE UMA LISTA NUMERADA
		vai = vai + "<ol>" + "\n";

		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// ENDENTA��O DA LINHA
//			s = new Endentacao(s).adiciona().getLinha();			
			
			// APLICA TRATAMENTO DIFERENCIADO PARA PAR�GRAFO, C�DIGO OU LISTA
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
