package lista6;

public class SessaoTeste {
	public static void main(String[] args) {
		
		Sala sala = new Sala(2, 80);
		Filme filme = new Filme("Doutor Estranho", 180);
		Sessao sessao = new Sessao("23/05/22", "18:50", 80, sala, filme);
		
		sessao.exibirRelatorioSessao();
		sessao.venderIngressos(90);
	}
}
