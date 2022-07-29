package lista4;

public class Artista extends Evento {
	protected String nome;
	protected String nacionalidade;
	protected String biografia;
	
	public Artista(String evento, Artista artista, String data, Local local, String classificacao, int ingresso) {
		super(evento, artista, data, local, classificacao, ingresso);
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}
	
	public String getNome() {
		return nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public String getBiografia() {
		return biografia;
	}
	
	
	
	
}
