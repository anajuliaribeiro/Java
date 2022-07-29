package lista5;

public class ImovelUsado extends Imovel{
	private double desconto;

	public ImovelUsado(String endere�o, double valorBase, double desconto) {
		super(endere�o, valorBase);
		this.desconto = desconto;
	}
	
	
	public void imprimirDados() {
		double valorTotal = this.valorBase + this.desconto;
		System.out.println("=========================");
		System.out.println("Im�vel Velho");
		super.imprimirDados();
		System.out.println("Desconto: R$" + this.desconto);
		System.out.println("Valor Total: R$" + valorTotal);
				
	}
	
	public double getDesconto() {
		return desconto;
	}

}



