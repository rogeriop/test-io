package gera.manual;

import comum.Licao;
import comum.PaginaDaLicaoVideos;
import comum.UsaLicao;

public class GeraEstruturaDeVideos implements UsaLicao {

	@Override
	public String transforma(Licao licao) {
		PaginaDaLicaoVideos paginaDaLicaoVideos = new PaginaDaLicaoVideos(licao);
		return paginaDaLicaoVideos.getListaOlDeLinksDeVideo();
	}

}
