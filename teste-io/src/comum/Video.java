package comum;

public class Video {

	private String sequencia;
	private String nome;
	private String url;
	
	public Video(String sequencia, String nome) {
		this.sequencia = sequencia;
		this.nome = nome;
	}

	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.url;
	}
	
	
}
