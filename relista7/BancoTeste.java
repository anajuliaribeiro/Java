package relista7;

public class BancoTeste {
	public static void main(String[] args) {
		Banco conta = new Banco();
		conta.criarNovaConta(1, "Ana Julia", 484765);
		conta.realizarDeposito(1, 1000);
		conta.realizarSaque(1, 10);
	}
}
