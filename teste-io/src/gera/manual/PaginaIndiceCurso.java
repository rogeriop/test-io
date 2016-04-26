package gera.manual;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import comum.Curso;
import comum.Licao;
import comum.UsaCurso;

public class PaginaIndiceCurso implements UsaCurso {

	// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
	private String vai = "";
	private String aux;
	private Curso curso;
	private List<Licao> licoes;

	@Override
	public String transforma(Curso curso) {
		
		this.curso = curso;
		licoes = curso.getLicoes();

		try {
			// LÊ ARQUIVO MODÊLO PROCURANDO PARA INTERCALAR TÍTULOS E RECURSOS
			Scanner sce = new Scanner(new FileInputStream("ModeloPaginaIndice.txt"));
			while (sce.hasNextLine()) {
				aux = sce.nextLine();
				if (aux.equals("<!-- Titulos -->")) {
					aux = insereTitulosLicoes();
					vai = vai + aux;
				} else if (aux.equals("<!-- Recursos -->")) {
					aux = insereRecursosDaLicao();
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

	// CONSTROI LINHAS DO BLOCO RECURSOS
	private String insereRecursosDaLicao() {
		
		String s = "";
		String conteudo = "";
		
		// PREPARA LINHA 01
		s = "O&nbsp;<a href='" + curso.getUrlCurso() + "' target='_blank'><font color='blue'><em>CURSO</em></font></a><font size='3'>&nbsp;" +
		curso.getEmailAluno() + ";&nbsp;" + curso.getSenhaAluno() + "</font>";
		conteudo = geraLinhaDaTabela(conteudo, "01", s);
		
		//PREPARA LINHA 02
		s = "<em>Workspace: <font color='#FF0000'>" + curso.getNomeWorkspace() + "</font>;" + 
		" M&aacute;quina:&nbsp;<font color='#FF0000'>" + curso.getIpMaquina() + "</font></em>";
		conteudo = geraLinhaDaTabela(conteudo, "02", s);
		
		// PREPARA LINHA 03
		s = "<em>Projetos: <font color='#FF0000'>" + curso.getNomeProjeto() + "</font></em>";
		conteudo = geraLinhaDaTabela(conteudo, "03", s);

		// PREPARA LINHA 04
		s = "<em>Github Local:&nbsp;<font color='red'>" + curso.getPastaGitHubLocal() + 
				";&nbsp;</font><a href='" + curso.getUrlGitHub() + "' target='_blank'><font color='blue'>Github Remoto</font></a></em>";
		conteudo = geraLinhaDaTabela(conteudo, "04", s);

		return conteudo;
	}

	// CONSTROI LINHAS DO BLOCO LIÇÕES
	private String insereTitulosLicoes() {

		String conteudo = "";

		for (Licao licao : licoes) {
			// APLICA TRATAMENTO DIFERENCIADO PARA PARÁGRAFO, CÓDIGO OU LISTA
			String s = licao.getNome();
			s = s.replace("<", "&lt;");
			s = s.replace(">", "&gt;");
			String codigo = licao.getCodigo();
			
			conteudo = geraLinhaDaTabela(conteudo, codigo, s);
		}

		return conteudo;
	}

	// FORMATA A LINHA DA TABELA
	private String geraLinhaDaTabela(String conteudo, String codigo, String s) {
		conteudo += "<tr>\n";
		conteudo += "<td align='right'>&nbsp;</td>\n";
		conteudo += "<td align='right'><font size='3'>&nbsp;" + codigo	+ " -&nbsp;</font></td>\n";
		conteudo += "<td><font size='3'>" + s + "</font></td>\n";
		conteudo += "</tr>\n";
		return conteudo;
	}

}
