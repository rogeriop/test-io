public class SubTitulo {

	public String transforma(String[] linhas) {

		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";

		// PÕE ENDEREÇO PARA O TÍTULO
		vai = vai + "<a name='B00'></a>" + "\n";
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";
		
		// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICAÇÃO
		for (String s : linhas) {

			// RETIRA OS SINAIS DE MAIOR E MENOR PARA NÃO CONFUNDIR O HTML
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");

			s = "<p><font size='3'><strong>" + s + "</strong></font></p>";

			vai = vai + s + "\n";
		}
		
		vai = vai + "<p><font size='3'>&nbsp;</font></p>" + "\n";
		

		return vai;
	}

}
