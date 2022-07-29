package relista7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	public List<Livro> livro;

	public Biblioteca() {
		this.livro = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String nomeLivro, String autor, int ano, String editora, int paginas) {
		Livro livro = new Livro(nomeLivro, autor, ano, editora, paginas);
		this.livro.add(livro);
		System.out.println("Livro '"+ nomeLivro + "' adicionado com sucesso!");
		
	}
	
	public void verificarDisponibilidade(String nomeLivro) {
		boolean verificacao = false;
		
		for (Livro livro : livro) {
			if(nomeLivro.equals(livro.getNomeLivro())) {
				verificacao = true;
				System.out.println("Livro " + nomeLivro + " está disponível.");
			}
		}
		
		if(verificacao == false) {
			System.out.println("Livro não disponível.");
		}
	}
	
	public void emprestarLivro(String nomeLivro, int diaE) {
		boolean verificacao = false;
		
		for (Livro livro : livro) {
			if(nomeLivro.equals(livro.getNomeLivro())) {
				verificacao = true;
				livro.emprestarLivro(diaE);
				System.out.println("Livro emprestado com sucesso!");
			}
			
		}
		if(verificacao == false) {
			System.out.println("Livro não disponível");
		}
	}
	
	public void efetuarDevolucao(String nomeLivro, int dia) {
		boolean verificacao = false;
		for (Livro livro : livro) {
			if(nomeLivro.equals(livro.getNomeLivro())) {
				livro.efetuarDevolucao(dia);
				verificacao = true;
				
			}
		}
		
		if(verificacao = false) {
			System.out.println("Livro não existente.");
		}
	}
}
