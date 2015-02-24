import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class TesteDois {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("teste.txt");
		Scanner sc = new Scanner(is);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
