package testes;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import comum.Curso;
import comum.Licao;
import comum.Video;

public class SerializacaoTest {

	
	public void devConverterParaXml() {

		Curso curso = new Curso("01", "Nome do Curso");
		curso.setUrlIndiceDoCurso("http://");
		curso.setUrlPastasDoCurso("http://");
		curso.setUrlCertificado("http://");
		curso.setUrlGitHub("http://");

		List<Licao> licoes = new ArrayList<>();

		licoes.add(montaLicao(new Licao("01", "A")));
		licoes.add(montaLicao(new Licao("02", "B")));
		licoes.add(montaLicao(new Licao("03", "C")));
		licoes.add(montaLicao(new Licao("04", "D")));
		licoes.add(montaLicao(new Licao("05", "E")));
		licoes.add(montaLicao(new Licao("06", "F")));

		curso.setLicoes(licoes);
		
		XStream xstream = new XStream();
		xstream.alias("curso", Curso.class);
		xstream.alias("licao", Licao.class);
		xstream.alias("video", Video.class);
		
		String resultado = xstream.toXML(curso);

	}

	private Licao montaLicao(Licao licao) {

		List<String> subTitulosDaExplicacao = new ArrayList<>();
		List<String> titulosExercicios = new ArrayList<>();
		List<Video> videos = new ArrayList<>();
		
		
		subTitulosDaExplicacao.add("Sub-Titulo");
		
		titulosExercicios.add("Ex1 - ");
		titulosExercicios.add("Ex2 - ");
		titulosExercicios.add("Ex3 - ");
		titulosExercicios.add("Ex4 - ");
		
		Video video1 = new Video("1.1", "A");
		
		videos.add(video1);

		licao.setSubTitulosDaExplicacao(subTitulosDaExplicacao);
		licao.setTitulosExercicios(titulosExercicios);
		licao.setVideos(videos);

		return licao;
		
	}

	
}
