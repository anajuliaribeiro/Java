package relista7;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nomeTurma;
	private List <Aluno> aluno;
	private double mediaTurma;
	
	public Turma(String nomeTurma, double mediaTurma) {
		this.nomeTurma = nomeTurma;
		this.mediaTurma = 0.00;
		this.aluno = new ArrayList<Aluno>();
		
	}
	
	public void adicionarAluno(String nomeAluno, int ra) {
		Aluno aluno = new Aluno(nomeAluno, ra);
		this.aluno.add(aluno);
		System.out.println("Aluno adicionado com sucesso! Nome aluno: " + nomeAluno);
		
	}
	
	public void adicionarNotasAluno() {
		
	}
	
	public void calcularMediaAluno(String nomeAluno, int ra) {
		
	}
}
