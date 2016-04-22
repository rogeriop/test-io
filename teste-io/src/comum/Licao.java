package comum;

import java.util.ArrayList;
import java.util.List;

public class Licao {

	String codigo;
	String nome;
	List<String> subTitulosDaExplicacao = new ArrayList<>();
	List<String> titulosExercicios = new ArrayList<>();
	List<Video> videos = new ArrayList<>();
	
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

	public Licao(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
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
	
	
	
	
	
	
/*	
*/	
}
