package comum;
import java.util.Scanner;

public class Opcoes {


	private String a = "";
	private int width = 0;
	private int height = 0;
	private int numeracao = 0;
	private int numeroLicao = 0;

	public Opcoes() {
		pegaOpcao();
	}
	
	public void pegaOpcao() {
		Scanner console = new Scanner(System.in);

		// PEGA OPÇÕES NA LINHA DE COMANDO
		do {
			
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("| TRANSCREVE (para)                         | FORMATA (para)      | GERA (um/uma/uns/umas)                     |");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("| (1)Codigo                                 |(12)Fonte maior      |(14)Estrutura de exercícios                 |");
			System.out.println("| (3)Lista Numerada                         | (9)Fundo cinza      |(17)Estrutura de sub-titulos da explicacao  |");
			System.out.println("| (5)Link (diferente label)                 |(11)Italico vermelho |(16)Icone Diploma -> coluna                 |");
			System.out.println("|(13)Link (mesmo label)                     |(10)Lista numerada   |(15)Icone tecla -> coluna                   |");
			System.out.println("| (7)Imagem -> linha                        | (6)Negrito          |(19)Pagina aula do curso                    |");
			System.out.println("| (2)Paragrafo                              |                     |(21)Paginas aulas do curso -> Ações Alfresco|");
			System.out.println("| (4)SubTitulo Explicacao -> linha          |                     |(18)Pagina indice do curso                  |");
			System.out.println("| (8)SubTitulo Exercicios/Respostas -> linha|                     |(20)Pastas de Aula  -> Ações Alfresco       |");
			System.out.println("|                                           |                     |(22)XML padrão do Curso                     |");
			System.out.println("|                                           |                     |                                            |");
			System.out.println("---------------------------------------------                     |                                            |");
			System.out.println("| ATUALIZA                                  |                     |                                            |");
			System.out.println("---------------------------------------------                     |                                            |");
			System.out.println("|(23)URLs de Videos da Licao                |                     |                                            |");
			System.out.println("|(24)Videos da Licao nas Pastas Alfresco    |                     |                                            |");
			System.out.println("|                                           |                     |                                            |");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("Para encerrar digite 99. Informe o tipo:");

			a = console.nextLine();
			if (!(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))
					&& !(a.equals("4"))  && !(a.equals("5"))  && !(a.equals("6"))
					&& !(a.equals("7"))  && !(a.equals("8"))  && !(a.equals("9"))
					&& !(a.equals("10")) && !(a.equals("11")) && !(a.equals("12")) 
					&& !(a.equals("13")) && !(a.equals("14")) && !(a.equals("15"))
					&& !(a.equals("16")) && !(a.equals("17")) && !(a.equals("18"))
					&& !(a.equals("19")) && !(a.equals("20")) && !(a.equals("21"))
					&& !(a.equals("22")) && !(a.equals("23")) && !(a.equals("24")) 
					&& !(a.equals("99"))) {
				System.out.println("Nada Feito");
			}
			if (a.equals("7")) {
				recebeTamanhoDaImagem();
			}
			if (a.equals("14") || a.equals("17") || a.equals("19")){
				recebeNumeroLicao();
			}
//			if (a.equals("21")){
//				recebeInicioNumeracao();
//			}
		} while (!(a.equals("1"))    && !(a.equals("2"))  && !(a.equals("3"))
				&& !(a.equals("4"))  && !(a.equals("5"))  && !(a.equals("6"))
				&& !(a.equals("7"))  && !(a.equals("8"))  && !(a.equals("9"))
				&& !(a.equals("10")) && !(a.equals("11")) && !(a.equals("12"))
				&& !(a.equals("13")) && !(a.equals("14")) && !(a.equals("15"))
				&& !(a.equals("16")) && !(a.equals("17")) && !(a.equals("18"))
				&& !(a.equals("19")) && !(a.equals("20")) && !(a.equals("21"))
				&& !(a.equals("22")) && !(a.equals("23")) && !(a.equals("24")) 
				&& !(a.equals("99")));
		
//		console.close();

	}

	// TRATA SUBMENU DA OPÇÃO 7-Imagem
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

//		consolex.close();
	}
	
	public void recebeInicioNumeracao() {
		Scanner consolex = new Scanner(System.in);
		System.out.println("Informe numeracao inicial do aula");
		numeracao = consolex.nextInt();
	}

	public void recebeNumeroLicao() {
		Scanner consolex = new Scanner(System.in);
		System.out.println("Informe numero da licao");
		numeroLicao = consolex.nextInt() - 1;
	}

	public int getNumeracao() {
		return this.numeracao;
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

	public int getNumeroLicao() {
		return numeroLicao;
	}

}
