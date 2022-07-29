package lista5;

public class Pessoa {
	protected String nome;
	protected String nascimento;
	protected long cpf;
	protected long rg;
	
	public Pessoa(String nome, String nascimento, long cpf, long rg) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nascimento: " + this.getNascimento());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("RG: " + this.getRg());

	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public long getCpf() {
		return cpf;
	}

	public long getRg() {
		return rg;
	}
	
	
	
}
