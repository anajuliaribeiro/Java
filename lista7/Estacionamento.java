package lista7;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<Vagas> carros;

	public Estacionamento() {
		this.carros = new ArrayList <Vagas>();
	}
	
	public void adicionarVaga(int numeroVaga, String placa) {
		Vagas veiculo1 = new Vagas(numeroVaga, placa);
		this.carros.add(veiculo1);
		System.out.println("Carro com a placa: " + placa + " adicionado na vaga: " + numeroVaga);
	}
	
	
}
