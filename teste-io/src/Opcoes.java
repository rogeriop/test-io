import java.util.Scanner;


public class Opcoes {
	public String pegaOpcao() {

		Scanner console = new Scanner(System.in);
		String a = "";
		
		// PEGA OPÇÕES NA LINHA DE COMANDO
		do {
			System.out.println("Informe tipo: 1-Codigo / 2-Paragrafo / 3-Lista Numerada / 4-SubTitulo / 5-Link /  6-Negrito / 9-Encerra");
			a = console.nextLine();
			if (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))&& !(a.equals("4"))&& !(a.equals("5"))&& !(a.equals("6"))&& !(a.equals("9"))) {
				System.out.println("Nada Feito");
			}
		} while (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3")) && !(a.equals("4"))&& !(a.equals("5"))&& !(a.equals("6"))&& !(a.equals("9")));
		return a;
	}
}
