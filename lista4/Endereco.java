package lista4;

public class Endereco {
	protected String logradouro;
	protected int numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
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
