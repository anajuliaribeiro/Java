package lista5;

public class Ingresso {
	protected double valor;
	protected String tipo;
	
	
	public Ingresso(double valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void imprimirDadosIngresso() {
		
		System.out.println("=======================================");
		System.out.println("Tipo Ingresso: " + this.tipo);
		System.out.println("Valor: R$" + this.valor);
		
		
		
	}
	
}
