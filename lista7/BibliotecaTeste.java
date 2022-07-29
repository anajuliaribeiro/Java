package lista7;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca livro1 = new Biblioteca();
		livro1.adicionarLivro("Livro", "Autor", "2022", "Editora", 150);
		livro1.efetuarEmprestimo("Livro", 5);
		livro1.efetuarDevolucao("Livro", 18);
	}
}
