public class FundoCinza {

	public String tranforma(String cenario) {

		String vai = "";

		vai = vai
				+ "<p><font size='3' color='#FFFFFF'> ********************* INSERCAO DE OBJETO COM BGCOLOR ******************************** </font></p>"
				+ "\n";
		vai = vai + "</td>" + "\n";
		vai = vai + "<td>&nbsp;</td>" + "\n";
		vai = vai + "</tr>" + "\n";
		vai = vai + "<tr>" + "\n";
		vai = vai + "<td align='right'>&nbsp;</td>" + "\n";
		vai = vai + "<td bgcolor='#F4F4F4'>" + "\n";

		vai = vai + cenario + "\n";
		
		
		vai = vai + "</td>" + "\n";
		vai = vai + "<td>&nbsp;</td>" + "\n";
		vai = vai + "</tr>" + "\n";
		vai = vai + "<tr>" + "\n";
		vai = vai + "<td align='right'>&nbsp;</td>" + "\n";
		vai = vai + "<td>" + "\n";
		vai = vai
				+ "<p><font size='3' color='#FFFFFF'> ***************** FIM DE INSERCAO DE OBJETO COM BGCOLOR ***************************** </font></p>";

		return vai;
	}
}
