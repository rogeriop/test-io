package comum;

import com.thoughtworks.xstream.XStream;

public class ConverteCursoParaXml {

	public static String toXml(Curso curso) {
		
		XStream xstream = new XStream();
		xstream.alias("curso", Curso.class);
		xstream.alias("licao", Licao.class);
		xstream.alias("video", Video.class);
		
		return xstream.toXML(curso);
		
	}
}
