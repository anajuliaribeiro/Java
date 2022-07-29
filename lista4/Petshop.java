package lista4;

public class Petshop {
	private String nomePet;
	private int idade;
	private Dono dono;
	private Tratamento tratamento;
	
	
	public Petshop(String nomePet, int idade, String nome, String cpf, String telefone, String email, String logradouro, int numero, String bairro, 
			String cidade, String estado, String descricao, String dataInicio, String dataFinal) {
		super();
		this.nomePet = nomePet;
		this.idade = idade;
		this.dono = new Dono(nome, cpf, telefone, email, logradouro, numero, bairro, cidade, estado);
		this.tratamento = new Tratamento(descricao, dataInicio, dataFinal);
	}

	public void imprimirDadosCachorro() {
		System.out.println("Nome Cachorro: " + this.nomePet);
		System.out.println("Nome Dono: " + this.dono.getNomeDono());
		System.out.println("CPF Dono: " + this.dono.getCpf());
		System.out.println("Idade cachorro: " + this.idade);
		System.out.println("Problema: " + this.tratamento.getDescricao());
		System.out.println("Telefone dono: " + this.dono.getTelefone());
		System.out.println("Logradouro: " + this.dono.endereco.getLogradouro());
		System.out.println("Número: " + this.dono.endereco.getNumero());
		System.out.println("Bairro: " + this.dono.endereco.getBairro());
		System.out.println("Cidade: " + this.dono.endereco.getCidade());
		System.out.println("UF: " + this.dono.endereco.getEstado());
		System.out.println("============================");

	}
	
	public void imprimirDadosGato() {
		System.out.println("Nome Gato: " + this.nomePet);
		System.out.println("Nome Dono: " + this.dono.getNomeDono());
		System.out.println("CPF Dono: " + this.dono.getCpf());
		System.out.println("Idade Gato: " + this.idade);
		System.out.println("Problema: " + this.tratamento.getDescricao());
		System.out.println("Telefone dono: " + this.dono.getTelefone());
		System.out.println("Logradouro: " + this.dono.endereco.getLogradouro());
		System.out.println("Número: " + this.dono.endereco.getNumero());
		System.out.println("Bairro: " + this.dono.endereco.getBairro());
		System.out.println("Cidade: " + this.dono.endereco.getCidade());
		System.out.println("UF: " + this.dono.endereco.getEstado());
		System.out.println("============================");

	}
	

	public String getNomePet() {
		return nomePet;
	}


	public int getIdade() {
		return idade;
	}


	public Dono getDono() {
		return dono;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	
	
}
