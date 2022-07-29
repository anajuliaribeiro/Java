package relista7;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca livro = new Biblioteca();
		livro.adicionarLivro("Dom casmurro", "nao sei", 1990, "Editora letras", 150);
		livro.emprestarLivro("Dom casmurro", 2);
		livro.efetuarDevolucao("Dom casmurro", 18);
	}
}
