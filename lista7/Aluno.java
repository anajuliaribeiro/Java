package lista7;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nomeAluno;
	private int ra;
	private double media;
	private boolean aprovado;
	private List <Aluno> notas;
	private double soma;
	
	public Aluno(String nomeAluno, int ra) {
		
		this.nomeAluno = nomeAluno;
		this.ra = ra;
		this.media = 0;
		this.aprovado = true;
	}

	public void adicionarNotasAluno() {
		for (Aluno notas : notas) {
			try {
				this.notas.add(notas);
				this.notas.add(notas);
				this.notas.add(notas);
				this.notas.add(notas);
				
			}catch (Exception ex) {
				System.out.println("Valor inválido. Informe um número.");
			}
		}
	}
	public void calcularMediaAluno() {
		for (Aluno notas : notas) {
			for(int i = 0; i <= 4; i++) {
				this.soma += notas;
			}
			this.media = this.soma/4;
			System.out.println("Média do aluno: " + this.media);
			if(media > 6) {
				System.out.println("Aluno aprovado");
			}else {
				System.out.println("Aluno reprovado");
			}
			
		}
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public int getRa() {
		return ra;
	}

	public double getMedia() {
		return media;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public List<Aluno> getNotas() {
		return notas;
	}

	public double getSoma() {
		return soma;
	}
	
}
