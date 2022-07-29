package lista7;

public class BancoTeste {
	public static void main(String[] args) {
		Banco conta1 = new Banco();
		conta1.criarContaNova(1105, 0, "Ana Julia", 48476);
		conta1.realizarDeposito(1105, 1500.00);
		conta1.realizarSaque(1105, 150);
		conta1.realizarSaque(1105, 1600);
		
		
	}
}
