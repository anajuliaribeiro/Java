package relista6;

public class Processo {
	public int numero;
	public String dataCriacao;
	public String descricao;
	
	public Processo(int numero, String dataCriacao, String descricao) {
		super();
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
