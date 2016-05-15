package gera.manual;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import comum.Curso;
import comum.Licao;
import comum.PaginaDaLicaoExercicios;
import comum.PaginaDaLicaoSubTitulosExplicacoes;
import comum.PaginaDaLicaoVideos;
import comum.UsaCursoELicao;

public class PaginaAulaCurso implements UsaCursoELicao {

	Curso curso;
	Licao licao;
	
	@Override
	public String transforma(Curso curso, Licao licao) {
		this.curso = curso;
		this.licao = licao;
		String urlPaginaIndiceDoCurso = curso.getUrlIndiceDoCurso();
		
		// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
		String vai = "";
		String aux;
		try {
			// MONTA A PÁGINA COM CONTEÚDO DE AULA
			Scanner sce = new Scanner(new FileInputStream("ModeloPaginaAula.txt"));
			while (sce.hasNextLine()) {
				aux = sce.nextLine();
				if (aux.equals("<!-- Retorno -->")) {
					vai += "<td align='right' width='15%'><a href='" + urlPaginaIndiceDoCurso + "' target='_self'><font size='3' color='blue'><em>Retorno</em></font></a></td>\n";
				} else if (aux.equals("<!-- Links Videos Aula -->")){
					vai += new PaginaDaLicaoVideos(licao).getListaOlDeLinksDeVideo();
				} else if (aux.equals("<!-- Links Sub_titulos Explicacoes -->")){
					vai += new PaginaDaLicaoSubTitulosExplicacoes(licao).getLinksSubTitulosExplicacoes();
				} else if (aux.equals("<!-- Links Exercicios -->"))	{
					vai += new PaginaDaLicaoExercicios(licao).getListaOlDeTitulosExercicios(); 
				} else if (aux.equals("<!-- Links Respostas Exercicios -->")) {
					vai += new PaginaDaLicaoExercicios(licao).getListaOlDeTitulosRespostasExercicios();
				} else if (aux.equals("<!-- Sub-Titulos Explicacoes -->")){
					vai += new PaginaDaLicaoSubTitulosExplicacoes(licao).getSubTitulosExplicacoes();
				} else if (aux.equals("<!-- Titulos Exercicios -->")) {
					vai += new PaginaDaLicaoExercicios(licao).getTitulosExercicios();
				} else if (aux.equals("<!-- Titulos Respostas Exercicios -->")) {
					vai += new PaginaDaLicaoExercicios(licao).getTitulosRespostasExercicios();
				} else {
					vai += aux + "\n";
				}
			}
			sce.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return vai = vai + " ";

	}

}
