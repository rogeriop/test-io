package comum;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String codigo;
	String nome;
	String urlIndiceDoCurso;
	String urlPastasDoCurso;
	String gitHub;
	List<Licao> licoes = new ArrayList<>();

	public Curso(String codigo, String nome, String paginaIndiceDoCurso, String paginaPastasDoCurso, String gitHub) {
		this.codigo = codigo;
		this.nome = nome;
		this.urlIndiceDoCurso = paginaIndiceDoCurso;
		this.urlPastasDoCurso = paginaPastasDoCurso;
		this.gitHub = gitHub;
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

	public String getPaginaIndiceDoCurso() {
		return urlIndiceDoCurso;
	}

	public void setPaginaIndiceDoCurso(String paginaIndiceDoCurso) {
		this.urlIndiceDoCurso = paginaIndiceDoCurso;
	}

	public String getPaginaPastasDoCurso() {
		return urlPastasDoCurso;
	}

	public void setPaginaPastasDoCurso(String paginaPastasDoCurso) {
		this.urlPastasDoCurso = paginaPastasDoCurso;
	}

	public String getGitHub() {
		return gitHub;
	}

	public void setGitHub(String gitHub) {
		this.gitHub = gitHub;
	}

	public List<Licao> getLicoes() {
		return licoes;
	}

	public void setLicoes(List<Licao> licoes) {
		this.licoes = licoes;
	}

}
