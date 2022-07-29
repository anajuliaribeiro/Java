package lista5;

public class ImovelUsado extends Imovel{
	private double desconto;

	public ImovelUsado(String endereço, double valorBase, double desconto) {
		super(endereço, valorBase);
		this.desconto = desconto;
	}
	
	
	public void imprimirDados() {
		double valorTotal = this.valorBase + this.desconto;
		System.out.println("=========================");
		System.out.println("Imóvel Velho");
		super.imprimirDados();
		System.out.println("Desconto: R$" + this.desconto);
		System.out.println("Valor Total: R$" + valorTotal);
				
	}
	
	public double getDesconto() {
		return desconto;
	}

}



