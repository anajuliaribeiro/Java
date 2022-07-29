package lista4;

public class Dono {
	protected String nomeDono;
	protected String cpf;
	protected String telefone;
	protected String email;
	protected Endereco endereco;
	
	
	public Dono(String nomeDono, String cpf, String telefone, String email, String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
		this.nomeDono = nomeDono;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, estado);
		
	}


	public String getNomeDono() {
		return nomeDono;
	}


	public String getCpf() {
		return cpf;
	}



	public String getTelefone() {
		return telefone;
	}


	public String getEmail() {
		return email;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	
	

}
