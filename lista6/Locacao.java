package lista6;

public class Locacao {
	public int diaLocacao;
	public int diaPrevistoLocacao;
	public int diaDevolucao;
	public ClienteLoc cliente;
	public double multa;
	public double valorLocacao;
	
	public Locacao(int diaLocacao, int diaPrevistoLocacao, int diaDevolucao, ClienteLoc cliente, double multa,
			double valorLocacao) {
		super();
		this.diaLocacao = diaLocacao;
		this.diaPrevistoLocacao = diaPrevistoLocacao;
		this.diaDevolucao = diaDevolucao;
		this.cliente = cliente;
		this.multa = multa;
		this.valorLocacao = valorLocacao;
	}
	
	
	
	
	
}
