package comum;

import java.util.ArrayList;
import java.util.List;

public class Licao {

	private String codigo;
	private String nome;
	private List<String> subTitulosDaExplicacao = new ArrayList<>();
	private List<String> titulosExercicios = new ArrayList<>();
	private List<Video> videos = new ArrayList<>();
	
	public Licao(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public List<String> getTitulosExercicios() {
		return titulosExercicios;
	}

	public void setTitulosExercicios(List<String> titulosExercicios) {
		this.titulosExercicios = titulosExercicios;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getSubTitulosDaExplicacao() {
		return subTitulosDaExplicacao;
	}

	public void setSubTitulosDaExplicacao(List<String> subTitulosDaExplicacao) {
		this.subTitulosDaExplicacao = subTitulosDaExplicacao;
	}
}
