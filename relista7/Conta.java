package relista7;

public class Conta {
	private int numeroConta;
	private double saldo;
	private String nomeCliente;
	private int cpf;
	
	public Conta(int numeroConta, String nomeCliente, int cpf) {
		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
	}
	
	public void realizarDeposito(int numeroConta, double deposito) {
		this.saldo += deposito;
		System.out.println("Deposito realizado com sucesso.\nSaldo atual: " + this.saldo);
	}
	
	public void realizarSaque(double saque) {
		if(saque <= this.saldo) {
			this.saldo -= saque;
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + this.saldo);
		}else {
			System.out.println("Saldo insuficiente.");
		}
		
	}
	
	public void iverificarSaldo() {
		System.out.println("======= SALDO =======");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Titular: " + this.nomeCliente);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("=====================");
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getCpf() {
		return cpf;
	}
	
	
}
