package lista5;

public class IngressoVip extends Ingresso{

	private double valorAdicional;
	protected String localizacao;
	
	public IngressoVip(double valor, String tipo, double valorAdicional, String localizacao) {
		super(valor, tipo);
		
		this.valorAdicional = 30;
		this.localizacao = localizacao;
	}

	private double calcularValorIngressoVip() {
		return this.valor + this.valorAdicional;
//		System.out.println(valorIngressoVip);
		
	}
	
	public void imprimirDadosIngresso() {
		super.imprimirDadosIngresso();
		System.out.println("Valor Ingresso VIP: R$" + calcularValorIngressoVip());
		System.out.println("Localização: " + this.localizacao);
		
	}
}
