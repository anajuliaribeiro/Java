package lista7;

public class TurmaTeste {
	public static void main(String[] args) {
		
		Turma turma1 = new Turma("POO");
		Aluno aluno1 = new Aluno("Ana Julia", 2201550);
		turma1.adicionarAluno("Ana Julia", 2201550);
		aluno1.adicionarNotasAluno();
		
	}
}
