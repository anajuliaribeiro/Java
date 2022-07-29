package lista4;

public class Local extends Evento{
	protected String nomeLocal;
	protected Endereco endereco;
	protected int capacidade;
	
	
	public Local(String evento, Artista artista, String data, Local local, String classificacao, int ingresso) {
		super(evento, artista, data, local, classificacao, ingresso);
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidade = capacidade;
	}


	public String getNomeLocal() {
		return nomeLocal;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public int getCapacidade() {
		return capacidade;
	}
	
	
	
}
