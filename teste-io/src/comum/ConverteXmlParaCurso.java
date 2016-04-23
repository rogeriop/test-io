package comum;

import com.thoughtworks.xstream.XStream;

public class ConverteXmlParaCurso {

	public static Curso cursoDeXml (String xml) {
		
		XStream xstream = new XStream();
		xstream.alias("curso", Curso.class);
		xstream.alias("licao", Licao.class);
		xstream.alias("video", Video.class);
		
		return (Curso) xstream.fromXML(xml);
		
	}
}
