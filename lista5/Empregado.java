package lista5;

public class Empregado extends Funcionario{
	private int carteiraTrabalho;

	public Empregado(String nome, String dataInicio, String endereco, String funcao, double salario, int carteiraTrabalho) {
		super(nome, dataInicio, endereco, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}
	

	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Carteira de Trabalho: " + this.carteiraTrabalho);
		}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@Override
	public String toString() {
		return "Empregado [carteiraTrabalho=" + carteiraTrabalho + "]";
	}
	
	
}
