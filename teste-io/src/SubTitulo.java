public class SubTitulo {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD
		String vai = "";

		// P�E ENDERE�O PARA O T�TULO
		vai = vai + "<a name='B00'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";
		
		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
		for (String s : linhas) {

			// RETIRA OS SINAIS DE MAIOR E MENOR PARA N�O CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='3'><strong>" + s + "</strong></font></p>";

			vai = vai + s + "\n";
		}
		
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";
		

		return vai;
	}

}
