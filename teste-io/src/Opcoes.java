import java.util.Scanner;

public class Opcoes {


	String a = "";
	int width = 0;
	int height = 0;

	public Opcoes() {
		pegaOpcao();
	}

	public void pegaOpcao() {
		Scanner console = new Scanner(System.in);

		// PEGA OPÇÕES NA LINHA DE COMANDO
		do {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|    TRANSCREVE     |      FORMATA        |       GERA                   |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|  1-Codigo         |  6-Negrito          |  4-SubTitulo Explicacao      |");
			System.out.println("|  2-Paragrafo      |  9-Fundo Cinza      |  5-Link (diferente do label) |");
			System.out.println("|  3-Lista Numerada | 10-Lista Numerada   |  7-Imagem                    |");
			System.out.println("|                   | 11-Italico Vermelho |  8-SubTitulo Exercicios      |");
			System.out.println("|                   | 12-Fonte Maior      | 13-Link (mesmo que o label)  |");
			System.out.println("|                   |                     | 14-Estrutura de exercícios   |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Para encerrar digite 99. Informe o tipo:");
			a = console.nextLine();
			if (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))
					&& !(a.equals("4"))  && !(a.equals("5"))  && !(a.equals("6"))
					&& !(a.equals("7"))  && !(a.equals("8"))  && !(a.equals("9"))
					&& !(a.equals("10")) && !(a.equals("11")) && !(a.equals("12")) 
					&& !(a.equals("13")) && !(a.equals("14")) && !(a.equals("99"))) {
				System.out.println("Nada Feito");
			}
			if (a.equals("7")) {
				recebeTamanhoDaImagem();
			}
		} while (!(a.equals("1"))    && !(a.equals("2"))  && !(a.equals("3"))
				&& !(a.equals("4"))  && !(a.equals("5"))  && !(a.equals("6"))
				&& !(a.equals("7"))  && !(a.equals("8"))  && !(a.equals("9"))
				&& !(a.equals("10")) && !(a.equals("11")) && !(a.equals("12"))
				&& !(a.equals("13")) && !(a.equals("14")) && !(a.equals("99")));

	}

	private void recebeTamanhoDaImagem() {

		Scanner consolex = new Scanner(System.in);

		int reducao = 0;
		System.out.println("Informe o tamanho da imagem");
		width = consolex.nextInt();
		System.out.println("Informe a altura da imagem");
		height = consolex.nextInt();
		System.out
				.println("Informe a diminuicao: 0=Nada / 1=10% / 2=20% / 3=30% / 4=40% / 5=50% ");
		reducao = consolex.nextInt();

		if (reducao == 1) {
			width = (int) (width * 0.9);
			height = (int) (height * 0.9);
		} else if (reducao == 2) {
			width = (int) (width * 0.8);
			height = (int) (height * 0.8);
		} else if (reducao == 3) {
			width = (int) (width * 0.7);
			height = (int) (height * 0.7);
		} else if (reducao == 4) {
			width = (int) (width * 0.6);
			height = (int) (height * 0.6);
		} else if (reducao == 5) {
			width = (int) (width * 0.5);
			height = (int) (height * 0.5);
		}

	}

	public String getA() {
		return a;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
