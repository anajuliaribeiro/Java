package lista5;

public class ImovelNovo extends Imovel{
	private double valorAdicional;

	public ImovelNovo(String endere�o, double valorBase, double valorAdicional) {
		super(endere�o, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imprimirDados() {
		
		double valorTotal = this.valorBase + this.valorAdicional;
		System.out.println("==============================================");
		super.imprimirDados();
		System.out.println("Im�vel Novo");
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
		System.out.println("Valor Total: R$" + valorTotal);

	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}
	
	
	
}
