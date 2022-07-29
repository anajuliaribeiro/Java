package lista5;

public class Aluno extends Pessoa{
	protected int nMatricula;

	public Aluno(String nome, String nascimento, long cpf, long rg, int nMatricula) {
		super(nome, nascimento, cpf, rg);
		this.nMatricula = nMatricula;
		
	}

	public int getnMatricula() {
		return nMatricula;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Matricula: " + this.getnMatricula());
		
	}
	
	
}
