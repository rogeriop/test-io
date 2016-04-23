package comum;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String codigo;
	String nome;
	String urlIndiceDoCurso;
	String urlPastasDoCurso;
	String urlGitHub;
	String urlCertificado;
	List<Licao> licoes = new ArrayList<>();

	public Curso(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getUrlIndiceDoCurso() {
		return urlIndiceDoCurso;
	}

	public void setUrlIndiceDoCurso(String urlIndiceDoCurso) {
		this.urlIndiceDoCurso = urlIndiceDoCurso;
	}

	public String getUrlPastasDoCurso() {
		return urlPastasDoCurso;
	}

	public void setUrlPastasDoCurso(String urlPastasDoCurso) {
		this.urlPastasDoCurso = urlPastasDoCurso;
	}

	public String getUrlGitHub() {
		return urlGitHub;
	}

	public void setUrlGitHub(String urlGitHub) {
		this.urlGitHub = urlGitHub;
	}

	public String getUrlCertificado() {
		return urlCertificado;
	}

	public void setUrlCertificado(String urlCertificado) {
		this.urlCertificado = urlCertificado;
	}

	public List<Licao> getLicoes() {
		return licoes;
	}

	public void setLicoes(List<Licao> licoes) {
		this.licoes = licoes;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}
