package lista7;

public class Livro {
	public String titulo;
	public String autor;
	public String anoPublicacao;
	public String editora;
	public int paginas;
	public boolean disponibilidade;
	public int diaE;
	
	
	public Livro(String titulo, String autor, String anoPublicacao, String editora, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.paginas = paginas;
		this.disponibilidade = true;
		this.diaE = 0;
		
	}

	public void verificarDisponibilidade() {
		if(this.disponibilidade == true) {
			System.out.println("Livro dispon�vel para empr�stimo.");
		}
		else {
			System.out.println("Livro n�o dispon�vel.");
		}
	}
	
	public void efetuarEmprestimo(int dia) {
		if(this.disponibilidade == true) {
			this.disponibilidade = false;
			
			this.diaE = dia;
			System.out.println("Empr�stimo efetuado.");
		}
		else {
			System.out.println("Livro n�o dispon�vel para empr�stimo.");
		}
		
		
	}
	
	public void efetuarDevolucao(int dia) {
		if(this.disponibilidade == false) {
			double multa = dia - this.diaE;

			if(dia > 7) {
				multa = (multa - 7) * 1.5;
				System.out.println("Livro entregue ap�s o prazo. Multa de " + multa + " reais.");
							
			}
			
			else {
				System.out.println("Livro entregue no prazo, n�o possui multas.");
			}
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	
	
	
}
