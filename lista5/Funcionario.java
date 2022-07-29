package lista5;

public class Funcionario extends Colaborador{
	protected String funcao;
	protected double salario;
	
	public Funcionario(String nome, String dataInicio, String endereco, String funcao, double salario) {
		super(nome, dataInicio, endereco);
		this.funcao = funcao;
		this.salario = salario; 
		
	}

		
	public void imprimirDados() {
			super.imprimirDados();
			System.out.println("Fun��o: " + this.funcao);
			System.out.println("Sal�rio: R$" + this.salario);
		}

	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + ", salario=" + salario + "]";
	}
	
	
}
