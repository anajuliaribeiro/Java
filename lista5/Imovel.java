package lista5;

public class Imovel{
	protected String endere�o;
	protected double valorBase;
	
	
	public Imovel(String endere�o, double valorBase) {
		super();
		this.endere�o = endere�o;
		this.valorBase = valorBase;
	}


	public void imprimirDados() {
		System.out.println("Endere�o: " + this.endere�o);
		System.out.println("Valor base: R$" + this.valorBase);
	}
	
	
}
