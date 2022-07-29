package lista7;

import java.util.ArrayList;
import java.util.List;

public class Banco{
	
	private List <Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void criarContaNova(int numeroConta, double saldo, String nome, int cpf) {
		Conta conta = new Conta(numeroConta, saldo, nome, cpf);
		this.contas.add(conta);
		System.out.println("Conta número " + numeroConta + " no nome de " + nome +  " criada com sucesso!");
		
	}

	public void verificarSaldo(int numeroConta) {
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.verificarSaldo();
				verificacao = true;
			}
		}
		
		if(verificacao == false) {
			System.out.println("Conta inexistente!");
		}
	}
	
	public void realizarSaque(int numeroConta, double sacar) {
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.realizarSaque(sacar);
				verificacao = true;
			}
		}
		
		if(verificacao == false) {
			System.out.println("Conta inexistente!");
		}
	}
	
	public void realizarDeposito(int numeroConta, double deposito) {
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.realizarDeposito(deposito);
				verificacao = true;			
			}
		}
		
		if(verificacao == false) {
			System.out.println("Conta inexistente!");
		}
	}
}
