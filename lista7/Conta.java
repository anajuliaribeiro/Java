package lista7;

public class Conta{
	private int numeroConta;
	private double saldo;
	private String nome;
	private int cpf;
	
	public Conta(int numeroConta, double saldo, String nome, int cpf) {
		
		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.nome = nome;
		this.cpf = cpf;

		
	}
	
	public void verificarSaldo() {
		System.out.println("======= SALDO =======");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Titular: " + this.nome);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("=====================");
		
	}
	
	public void realizarSaque(double sacar) {
		if(sacar <= this.saldo) {
			saldo -= sacar;
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + this.saldo + " reais");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void realizarDeposito(double deposito) {
		saldo += deposito;
		System.out.println("Valor depositado com sucesso!\nSaldo atual: " + this.saldo + " reais.");
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	

}
