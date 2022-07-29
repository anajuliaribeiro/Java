package relista7;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void criarNovaConta(int numeroConta, String nomeCliente, int cpf) {
		Conta conta = new Conta(numeroConta, nomeCliente, cpf);
		this.contas.add(conta);
		System.out.println("Conta número " + numeroConta + " criada com sucesso.");
	}
	
	public void realizarSaque(int numeroConta, double saque) {
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.realizarSaque(saque);
				verificacao = true;
			}
			
			if(verificacao == false) {
				System.out.println("Conta inexistente!");
			}
		}
	}
	
	public void realizarDeposito(int numeroConta, double deposito) {
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.realizarDeposito(numeroConta, deposito);
				verificacao = true;
				
			}
		}
		
		if(verificacao == false) {
			System.out.println("Conta inexistente!");
		}
	}
}
