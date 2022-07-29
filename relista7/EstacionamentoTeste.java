package relista7;

public class EstacionamentoTeste {
	public static void main(String[] args) {
		Estacionamento carro1 = new Estacionamento();
		
		carro1.estacionarCarro(10, "emx-8531", 9);
		carro1.retirarCarro(10,"emx-8531", 9);
	}
}
