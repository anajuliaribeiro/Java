package relista7;

public class Livro {
	private String nomeLivro;
	private String autor;
	private int ano;
	private String editora;
	private int paginas;
	private boolean disponibilidade;
	private int diaE;
	private int diaD;
	

	
	public Livro(String nomeLivro, String autor, int ano, String editora, int paginas) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.ano = ano;
		this.editora = editora;
		this.paginas = paginas;
		this.disponibilidade = true;
		this.diaE = 0;
	}

	
	public void emprestarLivro(int diaE) {
		if(this.disponibilidade == true) {
			System.out.println("Livro disponível para empréstimo!");
			
		}
	}
	
	public void efetuarDevolucao(int dia) {
		if(this.disponibilidade == false) {
			diaD = dia - diaE;
			if(dia > 7) {
				double multa = (diaD - 7) * 1.5;
				System.out.println("Livro entregue após o prazo. Multa de " + multa + " reais.");
			}
			else {
				System.out.println("Livro entregue no prazo, não possui multas.");
		
			}
			
			
		}
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
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
