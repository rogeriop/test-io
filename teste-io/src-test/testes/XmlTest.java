package testes;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import comum.Curso;
import comum.Licao;

public class XmlTest {

	public static void main(String[] args) {
		
		List<Licao> licoes = new ArrayList<>();
		
		Curso curso = new Curso("01", "Refatorando na pr�tica", "http://", "http://", "https://github.com/rogeriop/curso-refatoracao.git");

		licoes.add(new Licao("01", "Extraindo m�todos e classes"));
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
		
		
	}

	
}
