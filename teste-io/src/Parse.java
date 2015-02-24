import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Parse {
	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		
		ClipBoard clipBoard = new ClipBoard();
		String vem = clipBoard.obtem();
		String vai = "";
		
		InputStream is = new FileInputStream("in.txt");
		Scanner sc = new Scanner(is);
		
		PrintStream ps = new PrintStream("out.txt");
		
		Scanner console = new Scanner(System.in);
		System.out.println("Informe tipo: 1-Codigo / 2-Paragrafo / 9-Encerra");
		String a = console.nextLine();

		String[] linhas = vem.split("\n");
		
		for(String s: linhas) {
			if (a.equals("1")) {
				s = s.replace(" ", "&nbsp;");
				s = s.replace("<", "<font color=\"red\">&lt;");
				s = s.replace(">", "&gt;</font>");
				s = "<p><font size='3'>" + s + "</font></p>";
			} else if (a.equals("2")) {
				s = "<p><font size='3'>" + s + "</font></p>";
			}
			vai = vai + s + "\n";
		}

		clipBoard.copia(vai);
		
		
		
//		while(!a.equals("9")) {
		
			while(sc.hasNext()) {
			
				String s = sc.nextLine();
				if (!s.equals("")) {
					if (a.equals("1")) {
						s = s.replace(" ", "&nbsp;");
						s = s.replace("<", "<font color=\"red\">&lt;");
						s = s.replace(">", "&gt;</font>");
						s = "<p><font size='3'>" + s + "</font></p>";
					} else if (a.equals("2")) {
						s = "<p><font size='3'>" + s + "</font></p>";
     				}
	    			System.out.println(s);
	 	    		ps.println(s);
				}
			}
			
//			System.out.println("Informe tipo: 1-Paragrafo / 2-Codigo / 9-Encerra");
//			a = console.nextLine();
//	    }

				sc.close();
				ps.close();

	}
	
}
