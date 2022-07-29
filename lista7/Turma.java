package lista7;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nomeTurma;
	private double mediaTurma;
	private List <Aluno> alunos;
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.mediaTurma = 0.0;
		this.alunos = new ArrayList <Aluno>();
	}
	public void adicionarAluno(String nome, int ra) {
		Aluno aluno1 = new Aluno(nome, ra);
		this.alunos.add(aluno1);
		System.out.println(nome + " adicionado a lista de alunos.");
		this.calcularMediaAluno(nome, ra);
		
	}
	
	public void adicionarNotasAluno(int ra) {
		
	}
	public void calcularMediaAluno(String nomeAluno, double media) {
		boolean verificacao = false;
		for (Aluno aluno : alunos) {
			if(aluno.getNomeAluno() == nomeAluno) {
				aluno.calcularMediaAluno();
				verificacao = true;
			}
		}
	}
	
	public void calcularMediaTurma(double mediaTurma) {
		
	}
}
