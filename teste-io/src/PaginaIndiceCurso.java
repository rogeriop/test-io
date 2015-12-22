import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PaginaIndiceCurso implements TransformaLinhas {

	@Override
	public String transforma(String[] linhas) {
		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String aux;
		try {
			// Monta o indice
			Scanner sce = new Scanner(new FileInputStream("ModeloPaginaIndice.txt"));
			while (sce.hasNextLine()) {
				aux = sce.nextLine();
				if (aux.equals("<!-- Titulos -->")) {
					aux = linksAulas(linhas, 0);
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

	// CONSTROI LINHAS DO BLOCO linksAulas
	private String linksAulas(String[] linhas, int contadorDeLinhas) {

		String conteudo = "";

		for (String s : linhas) {
			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			contadorDeLinhas++;
			conteudo = conteudo + "<tr>\n";
			conteudo = conteudo + "<td align='right'>&nbsp;</td>\n";
			conteudo = conteudo + "<td align='right'><font size='3'>" + ((contadorDeLinhas < 10) ? "0" : "")
					+ contadorDeLinhas + " -&nbsp;</font></td>\n";
			conteudo = conteudo + "<td>" + s + "</td>\n";
			conteudo = conteudo + "</tr>\n";
		}

		return conteudo;
	}

}
