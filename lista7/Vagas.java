package lista7;

import java.util.List;

public class Vagas {
	private int numeroVaga;
	private boolean disponibilidade;
	private Veiculo veiculo;
	private int horaInicial;
	private int horaFinal;
	private int horaTotal;
	
	public Vagas(int numeroVaga, String placa) {
		this.numeroVaga = numeroVaga;
		this.disponibilidade = true;
		this.veiculo = new Veiculo(placa);
		this.horaInicial = 0;
		this.horaFinal = 0;
		this.horaTotal = 0;
	}
	
	public void estacionarVeiculo(int numeroVaga, int horaInicial) {
		if(disponibilidade == true) {
			disponibilidade = false;
	
		}
	}
	
}
