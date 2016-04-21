package gera.manual;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import comum.TransformaUmaLinha;

public class PaginaAulaCurso implements TransformaUmaLinha {

	@Override
	public String transforma(String linha) {
		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String aux;
		try {
			// Monta o indice
			Scanner sce = new Scanner(new FileInputStream("ModeloPaginaAula.txt"));
			while (sce.hasNextLine()) {
				aux = sce.nextLine();
				if (aux.equals("<!-- Retorno -->")) {
					aux = "<td align='right' width='15%'><a href='" + linha + "' target='_self'><font size='3' color='blue'><em>Retorno</em></font></a></td>\n";
					vai = vai + aux;
				} else {
					vai = vai + aux + "\n";
				}
			}
			sce.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return vai = vai + " ";

	}

}
