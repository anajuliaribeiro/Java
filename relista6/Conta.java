package relista6;

public class Conta {
	public PratoEntrada pratoEntrada;
	public PratoPrincipal pratoPrincipal;
	public Sobremesa sobremesa;
	public double valorTotalConta;
	
	
	public Conta(PratoEntrada pratoEntrada, PratoPrincipal pratoPrincipal, Sobremesa sobremesa,
			double valorTotalConta) {
		super();
		this.pratoEntrada = null;
		this.pratoPrincipal = null;
		this.sobremesa = null;
		this.valorTotalConta = 0.0;
	}
	
	public void pedirEntrada() {
		if(pratoEntrada == null) {
			this.pratoEntrada = new PratoEntrada(1, "Salada", "Alface, tomate, cenoura e molho especial", 15.00);
			this.valorTotalConta += this.pratoEntrada.getPrecoUnitario();
			
		}
		else {
			System.out.println("Entrada já foi pedida.");
		}
	}
	
	
	public void pedirPrincipal() {
		if(pratoPrincipal == null) {
			this.pratoPrincipal = new PratoPrincipal(2, "Strogonoff de Palmito", "Palmito, creme de leite, alho, cebola, molho de tomate", 30.00);
			this.valorTotalConta += this.pratoPrincipal.getPrecoUnitario();
			
		}
		else {
			System.out.println("Prato Principal já foi pedido.");
		}
	}
	
	public void pedirSobremesa() {
		if(sobremesa == null) {
			this.sobremesa = new Sobremesa(3, "Sorvete de Chocolate", "Sorvete", 8.00);
			this.valorTotalConta += this.sobremesa.getPrecoUnitario();
			
		}
		else {
			System.out.println("Sobremesa já foi pedida.");
		}
	}

	public PratoEntrada getPratoEntrada() {
		return pratoEntrada;
	}

	public PratoPrincipal getPratoPrincipal() {
		return pratoPrincipal;
	}

	public Sobremesa getSobremesa() {
		return sobremesa;
	}

	public double getValorTotalConta() {
		return valorTotalConta;
	}
	
	
}

