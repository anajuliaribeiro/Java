package relista7;

import java.util.ArrayList;
import java.util.List;

public class Vagas {
	private int numero;
	private Veiculo veiculo;
	private List <Veiculo> carro;
	private int horaInicial;
	private int horaFinal;
	private int horaTotal;
	private boolean disponivel;
	private double custo;
	
	
	public Vagas(int numero, String placa) {
		this.numero = numero;
		this.veiculo = new Veiculo(placa);
		this.carro = new ArrayList();
		this.horaFinal = 0;
		this.horaInicial = 0;
		this.horaTotal = 0;
		this.disponivel = true;
	}
	
	public void adicionarVaga(int numero) {
		
	}
	public void estacionarCarro(int numero,  String placa, int horaInicial) {
		if(disponivel == true) {
			this.disponivel = false;
			System.out.println("Carro com a placa: " + placa + " estacionado na vaga: " + numero);
			
		}
		
		if(horaInicial >= 0) {
			System.out.println("Carro entrou às " + horaInicial + "hrs.");
		}
		
	}
	
	public void retirarCarro(int numero, String placa, int horaFinal) {
		if(disponivel == false) {
			this.disponivel = true;
			System.out.println("Carro com a placa: " + placa + " foi retirado da vaga: " + numero);

			horaTotal = horaFinal - horaInicial;
					
			if(horaTotal >= 3) {
				this.custo = ((horaTotal - 3) * 0.5) + 2;
				System.out.println("Total de horas que o carro ficou estacionado: " + horaTotal + "\nCusto de: " + this.custo + " reais.");
			}
			
			if(horaTotal < 3) {
				System.out.println("Carro não permaneceu o tempo mínimo obrigatório.");
			}
		}
		
		else {
			System.out.println("Carro não encontrado.");
		}
	}

	public int getNumero() {
		return numero;
	}

	public int getHoraInicial() {
		return horaInicial;
	}

	public int getHoraFinal() {
		return horaFinal;
	}

	public int getHoraTotal() {
		return horaTotal;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public double getCusto() {
		return custo;
	}
	
	
	
	
}
