package comum;

import java.util.List;

public class PaginaDaLicaoVideos {
	List<Video> videos;
	String listaOlDeLinksDeVideo;
	public PaginaDaLicaoVideos(Licao licao) {
		this.videos = licao.getVideos();
		geraListaOlDeLinksDeVideos();
	}

	public String getListaOlDeLinksDeVideo() {
		return this.listaOlDeLinksDeVideo;
	}

	private void geraListaOlDeLinksDeVideos() {
		listaOlDeLinksDeVideo = "<ol>\n";
		for (Video video : videos) {
			String nomeVideo = video.getNome();
			nomeVideo = nomeVideo.replace("<", "&lt;");
			nomeVideo = nomeVideo.replace(">", "&gt;");
			nomeVideo = "<li><a href='" + video.getUrl() + "' target='_blank'><font size='3' color='blue'><em>" + nomeVideo + "</em></font></a></li>";
			listaOlDeLinksDeVideo += nomeVideo + "\n";
		}
		listaOlDeLinksDeVideo += "</ol>\n";
	}

}
