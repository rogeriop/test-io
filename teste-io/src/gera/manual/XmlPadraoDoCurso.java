package gera.manual;

import java.util.ArrayList;
import java.util.List;

import comum.ConverteCursoParaXml;
import comum.Curso;
import comum.Licao;
import comum.UsaCurso;
import comum.Video;

public class XmlPadraoDoCurso implements UsaCurso {

	@Override
	public String transforma(Curso curso) {

		curso.setDataFim("01/01/2016");
		
		curso.setUrlIndiceDoCurso("http://");
		curso.setUrlPastasDoCurso("http://");
		curso.setUrlCertificado("http://");
		
		// LINHA 01 PÁGINA ÍNDICE
		curso.setUrlCurso("http://www.google.com.br");
		curso.setEmailAluno("nome@provedor.com");
		curso.setSenhaAluno("110");
		
		// LINHA 02 PÁGINA ÍNDICE (RECURSOS)
		curso.setNomeWorkspace("NomeWorkspace");
		curso.setIpMaquina("10.0.0.122");
		
		// LINHA 03 PÁGINA ÍNDICE (RECURSOS)
		curso.setNomeProjeto("NomeProjeto");
		
		// LINHA 04 PÁGINA ÍNDICE (RECURSOS)
		curso.setUrlGitHub("http://github.com/");
		curso.setPastaGitHubLocal("CaminhoLocalProjeto");
		curso.setDiretorioVideos("c:\\Users\\NomeUsuario\\Downloads\\ALURA");
		
		List<Licao> licoes = new ArrayList<>();

		licoes.add(montaLicao(new Licao("01", "A")));
		licoes.add(montaLicao(new Licao("02", "B")));
		licoes.add(montaLicao(new Licao("03", "C")));
		licoes.add(montaLicao(new Licao("04", "D")));
		licoes.add(montaLicao(new Licao("05", "E")));
		licoes.add(montaLicao(new Licao("06", "F")));

		curso.setLicoes(licoes);
	
		return ConverteCursoParaXml.toXml(curso);
	}

	private Licao montaLicao(Licao licao) {

		List<String> subTitulosDaExplicacao = new ArrayList<>();
		List<String> titulosExercicios = new ArrayList<>();
		List<Video> videos = new ArrayList<>();
		
		
		subTitulosDaExplicacao.add("Sub-Titulo");
		
		titulosExercicios.add("Ex1");
		titulosExercicios.add("Ex2");
		titulosExercicios.add("Ex3");
		titulosExercicios.add("Ex4");
		
		Video video1 = new Video("01", "A");
		
		videos.add(video1);

		licao.setSubTitulosDaExplicacao(subTitulosDaExplicacao);
		licao.setTitulosExercicios(titulosExercicios);
		licao.setVideos(videos);

		return licao;
		
	}

}
