package gera.manual;

import comum.Licao;
import comum.PaginaDaLicaoSubTitulosExplicacoes;
import comum.UsaLicao;

public class GeraEstruturaSubTitulosExplicacao implements UsaLicao {

	@Override
	public String transforma(Licao licao) {
		PaginaDaLicaoSubTitulosExplicacoes subTitulosExplicacoes = new PaginaDaLicaoSubTitulosExplicacoes(licao);
		return subTitulosExplicacoes.getLinksSubTitulosExplicacoes() + "<!-- Sub-Titulos Explicacoes -->\n"
				+ subTitulosExplicacoes.getSubTitulosExplicacoes() + "<!-- FIM -->\n ";
	}
}
