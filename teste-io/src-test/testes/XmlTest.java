package testes;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import comum.ClipBoard;
import comum.Curso;
import comum.Licao;

public class XmlTest {

	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		
		List<Licao> licoes = new ArrayList<>();
		String s = ">%2F01%2520CURSOS%2F2014-12-19%2520ALURA%2F59%2520Refatorando%2520na%2520pr%25E1tica&page=1<1";
		s = s.replace("&", "&amp;");
		Curso curso = new Curso("59", "C�digo de Tali�o", "01/11/2014");
		curso.setUrlPastasDoCurso(">%2F01%2520CURSOS%2F2014-12-19%2520ALURA%2F59%2520Refatorando%2520na%2520pr%25E1tica&page=1<");
		curso.setDiretorioVideos("c:\\Users\\NomeUsuario\\Downloads\\ALURA");
		licoes.add(new Licao("01", ">%2F01%2520CURSOS%2F2014-12-19%2520ALURA%2F59%2520Refatorando%2520na%2520pr%25E1tica&page=1<"));
		licoes.add(new Licao("02", "Nomes mais leg�veis"));
		licoes.add(new Licao("03", "Ifs e Switches"));
		licoes.add(new Licao("04", "C�digo duplicado"));
		licoes.add(new Licao("05", "Par�metros booleanos"));
		licoes.add(new Licao("06", "Removendo N�meros m�gicos"));

		
		curso.setLicoes(licoes);
		
		XStream xstream = new XStream();
		xstream.alias("curso", Curso.class);
		xstream.alias("licao", Licao.class);
		String resultado = xstream.toXML(curso);
		
		System.out.println(resultado);

		new ClipBoard().copia(resultado);
		curso = (Curso)xstream.fromXML(new ClipBoard().obtem());
//		curso = (Curso)xstream.fromXML(resultado);
		System.out.println(curso.getNome());
		System.out.println(curso.getUrlPastasDoCurso());
		System.out.println("Teste " + curso.getDiretorioVideos());
		
	}

	
}


