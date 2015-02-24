import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class TesteTreis {
	public static void main(String[] args) throws IOException {
		
//		InputStream is = new FileInputStream("teste.txt");
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		OutputStream os = new FileOutputStream("outteste.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bo = new BufferedWriter(osw);
		
		
		while (sc.hasNextLine()) {
			System.out.println("Digite algo");
		  bo.write(sc.nextLine()); 	
		  bo.newLine();
		}
		
		bo.close();
		sc.close();
		
	}
}
