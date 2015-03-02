import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class ParseClipBoard {
	public static void main(String[] args) throws UnsupportedFlavorException,
			IOException {
		
		Calendar dateTime;
		ClipBoard clipBoard = new ClipBoard();
		Scanner console = new Scanner(System.in);
		String a = "";

		// PEGA OP��ES NA LINHA DE COMANDO
		do {
			System.out.println("Informe tipo: 1-Codigo / 2-Paragrafo / 3-Lista Numerada / 9-Encerra");
			a = console.nextLine();
			if (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))&& !(a.equals("9"))) {
				System.out.println("Nada Feito");
			}
		} while (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3")) && !(a.equals("9")));
		
		// EXECUTA A OP��O DESEJADA E SOLICITA MAIS DEMANDA
		while (!a.equals("9")) {


			// RECEBE CONTE�DO DO CLIPBOARD
			String vem = clipBoard.obtem();
			String[] linhas = vem.split("\n");

			// INICIO DE PREPARA��O DA VARI�VEL DE SA�DA PARA O CLIPBOARD 
			String vai = "";
			
			// CRIA UMA LINHA EM BRANCO ANTES DO C�DIGO
			if (a.equals("1")) {
				vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";}

			// ADICIONA 1a. TAG DE UMA LISTA NUMERADA
			if (a.equals("3")) {
				vai = vai + "<ol>" + "\n";}

			// VARRE AS LINHAS VINDAS DO CLIPBOARD PARA MODIFICA��O
			for (String s : linhas) {

				// ADICIONA NA VARI�VEL DE SA�DA ENDENTA��O DO PAR�GRAFO
				char charArray[] = s.toCharArray();
				int i = 0;
				if (charArray.length > 0 && charArray[0] == ' ') {
					for (char c :charArray) {
						if (c != ' ') {
							break;
						} else {
							i++;
						}
					}
					for (int x = 0; x < i; x++) {
						s = "&nbsp;" + s;
					}
				}
				
				
				// APLICA TRATAMENTO DIFERENCIADO PARA PAR�GRAFO, C�DIGO OU LISTA
				s = s.replace("<", "&lt;");
				s = s.replace(">", "&gt;");
				if (a.equals("1")) {
					s = "<p><font size='2' color='purple'><em><strong>" + s + "</strong></em></font></p>";
				} else if (a.equals("2")) {
					s = "<p><font size='3'>" + s + "</font></p>";
				} else if (a.equals("3")) {
					s = "<li><p><font size='3'>" + s + "</font></p></li>";
				}
				
				vai = vai + s + "\n";
			}

			// CRIA UMA LINHA EM BRANCO AP�S O C�DIGO
			if (a.equals("1")) {
				vai = vai + "<p><font size='3'>" + "&nbsp;" + "</font></p>" + "\n";}

			// FECHA TAG DE UMA LISTA NUMERADA
			if (a.equals("3")) {
				vai = vai + "</ol>" + "\n";}

			// GRAVA TRATAMENTO DO TEXTO NO CLIBOARD
			clipBoard.copia(vai);

			// INFORMA HORA DE CONCLUS�O DA OP��O SOLICITADA
			dateTime = Calendar.getInstance();
			System.out.print("Feito as " );
			System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);

			// PEGA PR�XIMA OP��O NA LINHA DE COMANDO
			do {
				System.out.println("Informe tipo: 1-Codigo / 2-Paragrafo / 3-Lista Numerada / 9-Encerra");
				a = console.nextLine();
				if (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3")) && !(a.equals("9"))) {
					System.out.println("Nada Feito");
				}
			} while (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3")) && !(a.equals("9")));
			
		}

		System.out.println("Bye!");
	}

}
