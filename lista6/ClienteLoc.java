package lista6;

public class ClienteLoc {
	public String nome;
	public String nascimento;
	public String telefone;
	public Endereco endereco;
	
	public ClienteLoc(String nome, String nascimento, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	
}
