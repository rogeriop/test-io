import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Calendar;

public class ParseClipBoard {
	public static void main(String[] args) throws UnsupportedFlavorException,
			IOException {
		
		Calendar dateTime;
		ClipBoard clipBoard = new ClipBoard();

		// PEGA PRÓXIMA OPÇÃO NA LINHA DE COMANDO
		String a = new Opcoes().pegaOpcao();
		
		// EXECUTA A OPÇÃO DESEJADA E SOLICITA MAIS DEMANDA
		while (!a.equals("9")) {

			// RECEBE CONTEÚDO DO CLIPBOARD
			String vem = clipBoard.obtem();
			
			// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD 
			String vai = "";

			switch (a) {
			case "1":
				vai = new Codigo().transforma(vem);
				break;
			case "2":
				vai = new Paragrafo().transforma(vem);
				break;
			case "3":
				vai = new ListaNumerada().transforma(vem);
				break;
			}
			
			// GRAVA TRATAMENTO DO TEXTO NO CLIBOARD
			clipBoard.copia(vai);

			// INFORMA HORA DE CONCLUSÃO DA OPÇÃO SOLICITADA
			dateTime = Calendar.getInstance();
			System.out.print("Feito as " );
			System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
			
			// PEGA PRÓXIMA OPÇÃO NA LINHA DE COMANDO
			a = new Opcoes().pegaOpcao();
			
		}

		System.out.println("Bye!");
	}

}
