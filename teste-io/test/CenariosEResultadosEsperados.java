import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class CenariosEResultadosEsperados  {


	public String trasCenarioOpcao1() throws IOException {

		String vem = "";


		// monta o cenário
		Scanner sce = new Scanner(new FileInputStream("Opcao1TextoParaTeste.txt"));
		while(sce.hasNextLine()) {
			vem = vem + sce.nextLine() + "\n";
		}
		return vem;
		
	}
	
	public String trasResultadoOpcao1() throws IOException {
		String MeuResultado = "";
		
		Scanner scs = new Scanner(new FileInputStream("Opcao1ResultadoEsperado.txt"));
		while(scs.hasNextLine()) {
			MeuResultado = MeuResultado + scs.nextLine() + "\n";
		}
		
		return MeuResultado;
		
	}


}
