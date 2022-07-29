package lista7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
	
	private List <Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList <Livro>();
		
	}
	
	public void adicionarLivro(String titulo, String autor, String anoPublicacao, String editora, int paginas) {
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, paginas);
		this.livros.add(livro);
		System.out.println("Livro '" + titulo + "' adicionado com sucesso.");
	 }
	
	public void verificarDisponibilidade(String titulo){
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			if (titulo.equals(livro.getTitulo())){
				verificacao = true;
				livro.verificarDisponibilidade();
			}
		}
		
		if(verificacao == false) {
			System.out.println("Livro não existe na biblioteca.");
		}
	}
	
	public void efetuarEmprestimo(String titulo, int diaE) {
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			if (titulo.equals(livro.getTitulo())){
				verificacao = true;
				livro.efetuarEmprestimo(diaE);
			}
		}
		
		if(verificacao == false) {
			System.out.println("Livro não existe na biblioteca.");
		}
		
	}
	
	public void efetuarDevolucao(String titulo, int diaD) {
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			if (titulo.equals(livro.getTitulo())){
				verificacao = true;
				livro.efetuarDevolucao(diaD);
				
			}
		}
		
		if(verificacao == false) {
			System.out.println("Livro não existe na biblioteca.");
		}
		
	}

}
