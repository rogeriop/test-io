package gera.manual;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import comum.Curso;
import comum.Licao;
import comum.UsaCurso;

public class GeraPaginaSumarioDoCurso implements UsaCurso {

	// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD
	private Curso curso;
	private List<Licao> licoes;
	private List<String> recursosAdicionais;
	private int contadorDeLinhas;

	@Override
	public String transforma(Curso curso) {
		this.curso = curso;
		this.recursosAdicionais = curso.getRecursosAdicionais();
		this.licoes = curso.getLicoes();
		String vai = "";

		try {
			// LÊ ARQUIVO MODÊLO PROCURANDO PARA INTERCALAR TÍTULOS E RECURSOS
			Scanner sce = new Scanner(new FileInputStream("ModeloPaginaIndice.txt"));
			while (sce.hasNextLine()) {
				String aux = sce.nextLine();
				if (aux.equals("<!-- Titulos -->")) {
					vai += insereBlocoComOsTitulosDasLicoes();
				} else if (aux.equals("<!-- Recursos -->")) {
					vai += insereBlocoComOsRecursosNecessariosParaALicao();
				} else {
					vai += aux + "\n";
				}
			}
			sce.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return vai += " ";
	}

	private String insereBlocoComOsRecursosNecessariosParaALicao() {
		String linha01DoBlocoDeRecursos = "O&nbsp;<a href='" + curso.getUrlCurso()
				+ "' target='_blank'><font color='blue'><em>CURSO</em></font></a><font size='3'>&nbsp;"
				+ curso.getEmailAluno() + ";&nbsp;" + curso.getSenhaAluno() + "</font>";
		String linha02DoBlocoDeRecursos = "<em>Workspace: <font color='#FF0000'>" + curso.getNomeWorkspace()
				+ "</font>;" + " M&aacute;quina:&nbsp;<font color='#FF0000'>" + curso.getIpMaquina() + "</font></em>";
		String linha03DoBlocoDeRecursos = "<em>Projetos: <font color='#FF0000'>" + curso.getNomeProjeto()
				+ "</font></em>";
		String linha04DoBlocoDeRecursos = "<em>Github Local:&nbsp;<font color='red'>" + curso.getPastaGitHubLocal()
				+ ";&nbsp;</font><a href='" + curso.getUrlGitHub()
				+ "' target='_blank'><font color='blue'>Github Remoto</font></a></em>";
		String conteudoDoBlocoRecursos = "";

		contadorDeLinhas = 0;
		conteudoDoBlocoRecursos = geraLinhaDaTabela(conteudoDoBlocoRecursos, numeroDaLinha(), linha01DoBlocoDeRecursos);
		conteudoDoBlocoRecursos = geraLinhaDaTabela(conteudoDoBlocoRecursos, numeroDaLinha(), linha02DoBlocoDeRecursos);
		conteudoDoBlocoRecursos = geraLinhaDaTabela(conteudoDoBlocoRecursos, numeroDaLinha(), linha03DoBlocoDeRecursos);
		conteudoDoBlocoRecursos = geraLinhaDaTabela(conteudoDoBlocoRecursos, numeroDaLinha(), linha04DoBlocoDeRecursos);

		for (String linhaNnDoBlocoDeRecursos : recursosAdicionais) {
			conteudoDoBlocoRecursos = geraLinhaDaTabela(conteudoDoBlocoRecursos, numeroDaLinha(), linhaNnDoBlocoDeRecursos);
		}

		return conteudoDoBlocoRecursos;
	}

	private String numeroDaLinha() {
		contadorDeLinhas++;
		return ((contadorDeLinhas < 10) ? "0" : "") + contadorDeLinhas;
	}

	private String insereBlocoComOsTitulosDasLicoes() {
		String conteudo = "";

		for (Licao licao : licoes) {
			String numeroDaLicao = licao.getCodigo();
			String nomeDaLicao = licao.getNome().replace("<", "&lt;").replace(">", "&gt;");
			conteudo = geraLinhaDaTabela(conteudo, numeroDaLicao, nomeDaLicao);
		}
		return conteudo;
	}

	private String geraLinhaDaTabela(String conteudo, String numeroDaLinha, String linha) {
		conteudo += "<tr>\n";
		conteudo += "<td align='right'>&nbsp;</td>\n";
		conteudo += "<td align='right'><font size='3'>&nbsp;" + numeroDaLinha + " -&nbsp;</font></td>\n";
		conteudo += "<td><font size='3'>" + linha + "</font></td>\n";
		conteudo += "</tr>\n";
		return conteudo;
	}

}
