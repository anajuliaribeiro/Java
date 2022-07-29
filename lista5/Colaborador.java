package lista5;

public class Colaborador {
	protected String nome;
	protected String dataInicio;
	protected String endereco;
	
	public Colaborador(String nome, String dataInicio, String endereco) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data inicio: " + this.dataInicio);
		System.out.println("Endereço: " + this.endereco);
	}

	@Override
	public String toString() {
		return "Colaborador [nome=" + nome + ", dataInicio=" + dataInicio + ", endereco=" + endereco + "]";
	}
	
	
	
}
