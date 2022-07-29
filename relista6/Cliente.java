package relista6;

public class Cliente {
	public String nome;
	public String cpf;
	public Conta conta;
	
	public Cliente(String nome, String cpf, Conta conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}
	
	public void fecharConta() {
		System.out.println("=============================");

		if(this.conta.getPratoEntrada() != null) {
			System.out.println("Entrada: " + this.conta.getPratoEntrada().nome);
			System.out.println("Valor: R$ " + this.conta.getPratoEntrada().precoUnitario);
		}
		
		if(this.conta.getPratoPrincipal() != null) {
			System.out.println("Principal: " + this.conta.getPratoPrincipal().nome);
			System.out.println("Valor: R$ " + this.conta.getPratoPrincipal().precoUnitario);
		}
		
		if(this.conta.getSobremesa() != null) {
			System.out.println("Sobremesa: " + this.conta.getSobremesa().nome);
			System.out.println("Valor: R$ " + this.conta.getSobremesa().precoUnitario);
		}
		
		System.out.println("Valor total da conta: R$ " + this.conta.valorTotalConta + (this.conta.valorTotalConta * 0.1));
		
		System.out.println("=============================");
	}
}
