package lista5;

public class Estagiario extends Funcionario{
	private int cee;

	public Estagiario(String nome, String dataInicio, String endereco, String funcao, double salario, int cee) {
		super(nome, dataInicio, endereco, funcao, salario);
		this.cee = cee;
	}
	

	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CEE: " + this.cee);
		}

	public int getCee() {
		return cee;
	}

	public void setCee(int cee) {
		this.cee = cee;
	}

	@Override
	public String toString() {
		return "Estagiario [cee=" + cee + "]";
	}
	
	
}
