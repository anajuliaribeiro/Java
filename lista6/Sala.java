package lista6;

public class Sala{
	private int nIdentificacao;
	private int capacidadeMax;


	public Sala(int nIdentificacao, int capacidadeMax) {
		super();
		this.nIdentificacao = nIdentificacao;
		this.capacidadeMax = capacidadeMax;
	}



	public int getnIdentificacao() {
		return nIdentificacao;
	}




	public void setnIdentificacao(int nIdentificacao) {
		this.nIdentificacao = nIdentificacao;
	}




	public int getCapacidadeMax() {
		return capacidadeMax;
	}




	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	
}
