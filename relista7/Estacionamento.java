package relista7;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	
	private List <Vagas> vaga;

	public Estacionamento() {
		this.vaga = new ArrayList <Vagas>();
	}
	
//	public void adicionarVaga(int numero) {
//		Vagas vaga1 = new Vagas(numero);
//	}
	public void estacionarCarro(int numero, String placa, int horaInicial) {
		Vagas carro1 = new Vagas(numero, placa);
		this.vaga.add(carro1);
		boolean verificacao = false;
		
		for (Vagas vagas : vaga) {
			if(vagas.getNumero() == numero) {
				vagas.estacionarCarro(numero, placa, horaInicial);
			}
			
			verificacao = true;
		}
		
		if(verificacao == false) {
			System.out.println("vaga não existe.");
		}
	}
	
	public void retirarCarro(int numero, String placa, int horaFinal) {
		boolean verificacao = false;
		if (verificacao == true) {
			for (Vagas vagas : vaga) {
				if(vagas.getNumero() == numero) {
					vagas.retirarCarro(numero, placa, horaFinal);
					verificacao = false;
				}
			}
			
			if(verificacao == false) {
				System.out.println("veículo não encontrado.");
			}
		}
	}
}	
