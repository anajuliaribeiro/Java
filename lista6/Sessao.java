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
				
				System.out.println("Você comprou " + quantidade + " ingressos.");
				System.out.println("Quantidade de ingressos disponíveis para venda: " + this.nIngressos);
			}else {
				System.out.println("Erro.\nQuantidade de ingressos não disponível.");
			}
	}
	public void exibirRelatorioSessao() {
		System.out.println("Data Sessão: " + this.data);
		System.out.println("Horário Sessão: " + this.horario);
		System.out.println("Ingressos disponíveis: " + this.nIngressos);
		System.out.println("Sala Sessão: " + this.sala.getnIdentificacao());
		System.out.println("Capacidade Máxima Sala: " + this.sala.getCapacidadeMax());
		System.out.println("Título Filme: " + this.filme.getTitulo());
		System.out.println("Duração Filme: " + this.filme.getDuracao());
	}

	
}
