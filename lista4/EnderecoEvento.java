package lista4;

public class EnderecoEvento extends Evento {
	protected String logradouro;
	protected int numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	

	public EnderecoEvento(String evento, Artista artista, String data, Local local, String classificacao,
			int ingresso) {
		super(evento, artista, data, local, classificacao, ingresso);
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public int getNumero() {
		return numero;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getEstado() {
		return estado;
	}

	

	
	
}
