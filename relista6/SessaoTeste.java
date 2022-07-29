package relista6;

public class SessaoTeste {
	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Doutor Estranho", 120);
		Sala sala1 = new Sala(4, 100);
		Sessao sessao1 = new Sessao("29/05/22", "18:00hrs", 100, sala1, filme1);
		
		sessao1.imprimirRelatorio();
		sessao1.comprarIngressos(5);
		
		
	}
}
