package lista5;

public class Imovel{
	protected String endereço;
	protected double valorBase;
	
	
	public Imovel(String endereço, double valorBase) {
		super();
		this.endereço = endereço;
		this.valorBase = valorBase;
	}


	public void imprimirDados() {
		System.out.println("Endereço: " + this.endereço);
		System.out.println("Valor base: R$" + this.valorBase);
	}
	
	
}
