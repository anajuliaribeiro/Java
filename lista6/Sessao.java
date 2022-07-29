package lista6;

public class Sessao {
	private String data;
	private String horario;
	private int nIngressos;
	private Sala sala;
	private Filme filme;
	
	
	public Sessao(String data, String horario, int nIngressos, Sala sala, Filme filme) {
		super();
		this.data = data;
		this.horario = horario;
		this.sala = sala;
		this.nIngressos = this.sala.getCapacidadeMax();
		
		this.filme = filme;
	}

	public void venderIngressos(int quantidade) {
			if (quantidade <= this.nIngressos) {
				this.nIngressos -= quantidade;
				
				System.out.println("Voc� comprou " + quantidade + " ingressos.");
				System.out.println("Quantidade de ingressos dispon�veis para venda: " + this.nIngressos);
			}else {
				System.out.println("Erro.\nQuantidade de ingressos n�o dispon�vel.");
			}
	}
	public void exibirRelatorioSessao() {
		System.out.println("Data Sess�o: " + this.data);
		System.out.println("Hor�rio Sess�o: " + this.horario);
		System.out.println("Ingressos dispon�veis: " + this.nIngressos);
		System.out.println("Sala Sess�o: " + this.sala.getnIdentificacao());
		System.out.println("Capacidade M�xima Sala: " + this.sala.getCapacidadeMax());
		System.out.println("T�tulo Filme: " + this.filme.getTitulo());
		System.out.println("Dura��o Filme: " + this.filme.getDuracao());
	}

	
}
