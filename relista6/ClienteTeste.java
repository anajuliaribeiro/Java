package relista6;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(null, null, null, 0);
		Cliente cliente1 = new Cliente("Ana Julia Ribeiro", "48476568819", conta1);
		
		conta1.pedirEntrada();
		conta1.pedirPrincipal();
		conta1.pedirSobremesa();
		cliente1.fecharConta();
		
	}
}
