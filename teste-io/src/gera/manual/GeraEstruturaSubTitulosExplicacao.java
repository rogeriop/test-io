package gera.manual;

import comum.Licao;
import comum.SubTitulosExplicacoes;

public class GeraEstruturaSubTitulosExplicacao implements UsaLicao {

	@Override
	public String transforma(Licao licao) {
		SubTitulosExplicacoes subTitulosExplicacoes = new SubTitulosExplicacoes(licao);
		return subTitulosExplicacoes.getLinksSubTitulosExplicacoes() + "<!-- Sub-Titulos Explicacoes -->\n"
				+ subTitulosExplicacoes.getSubTitulosExplicacoes() + "<!-- FIM -->\n ";
	}
}
