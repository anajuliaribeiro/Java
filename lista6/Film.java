package lista6;

public class Film {
	public String titulo;
	public int duracao;
	public double preco;
	public Locacao locacao;
	
	public Film(String titulo, int duracao, double preco) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		
	}
	
	public void locarFilme(ClienteLoc cliente, int diaLocacao) {
		if(this.locacao == null) {
			
			this.locacao = new Locacao(cliente, diaLocacao, this.preco);
			
			System.out.println("Filme " + this.titulo + "foi alugado pelo cliente: " + this.locacao.);
		}
	}
	
	public void devolverFilme() {
		
	}
}
