package relista7;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nomeAluno;
	private int ra;
	private List <Aluno> notas;
	private double mediaAluno;
	private boolean aprovado;
	
	public Aluno(String nomeAluno, int ra) {
		this.nomeAluno = nomeAluno;
		this.ra = ra;
		this.notas = new ArrayList<Aluno>();
		this.mediaAluno = 0.00;
		this.aprovado = false;
		
	}
	
	public void adicionarAluno() {
		
	}

	public void adicionarNotasAluno() {
		for (Aluno notas : notas) {
			this.notas.add(notas);
			this.notas.add(notas);
			this.notas.add(notas);
			this.notas.add(notas);
			System.out.println("Notas adicionadas.");
			
		}
	}
	
	public void calcularMediaAluno() {
		for (Aluno media : notas) {
			media = notas/4;
		}
	}
}
