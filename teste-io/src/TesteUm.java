import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TesteUm {
	public static void main(String[] args) throws IOException {
//		InputStream in = new FileInputStream("teste.txt");
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);

		BufferedReader br = new BufferedReader(
				                  new InputStreamReader(
				                		new FileInputStream("teste.txt")));
		
//		System.out.println("Digite sua mensagem");
		String s = br.readLine();
		
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();
	}
}
