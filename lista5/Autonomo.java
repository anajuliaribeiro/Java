package lista5;

public class Autonomo extends Prestador{
	private long cpf;

	public Autonomo(String nome, String dataInicio, String endereco, double valorHora, String tipoServico, long cpf) {
		super(nome, dataInicio, endereco, valorHora, tipoServico);
		this.cpf = cpf;
	}


	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CPF: " + this.cpf);
		}
	
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + "]";
	}
	
	
}
