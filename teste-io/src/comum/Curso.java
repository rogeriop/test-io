package comum;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String codigo;
	String nome;
	String dataInicio;
	String dataFim;
	String urlIndiceDoCurso;
	String urlPastasDoCurso;
	String urlCertificado;
	
	// LINHA 01 PÁGINA ÍNDICE (RECURSOS)
	String urlCurso;
	String emailAluno;
	String senhaAluno;
	// LINHA 02 PÁGINA ÍNDICE (RECURSOS)
	String nomeWorkspace;
	String ipMaquina;
	// LINHA 03 PÁGINA ÍNDICE (RECURSOS)
	String nomeProjeto;
	// LINHA 04 PÁGINA ÍNDICE (RECURSOS)
	String urlGitHub;
	String pastaGitHubLocal;
	
	List<Licao> licoes = new ArrayList<>();

	public Curso(String codigo, String nome, String dataInicio) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataInicio = dataInicio;
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

	public String getUrlCurso() {
		return urlCurso;
	}

	public void setUrlCurso(String urlCurso) {
		this.urlCurso = urlCurso;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getSenhaAluno() {
		return senhaAluno;
	}

	public void setSenhaAluno(String senhaAluno) {
		this.senhaAluno = senhaAluno;
	}

	public String getNomeWorkspace() {
		return nomeWorkspace;
	}

	public void setNomeWorkspace(String nomeWorkspace) {
		this.nomeWorkspace = nomeWorkspace;
	}

	public String getIpMaquina() {
		return ipMaquina;
	}

	public void setIpMaquina(String ipMaquina) {
		this.ipMaquina = ipMaquina;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getPastaGitHubLocal() {
		return pastaGitHubLocal;
	}

	public void setPastaGitHubLocal(String pastaGitHubLocal) {
		this.pastaGitHubLocal = pastaGitHubLocal;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getDataInicio() {
		return dataInicio;
	}

}
