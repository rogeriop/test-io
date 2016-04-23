package comum;

import java.util.List;

public class ExtraiVaiDeXml {

	public static String opcao18 (String vai) {
		
		Curso curso = ConverteXmlParaCurso.cursoDeXml(vai);
		List<Licao> licoes = curso.getLicoes();

		String s = "";
		
		for (Licao licao : licoes) {
			s = s + licao.getNome() + "\n";
		}
		return s;
	}
}
