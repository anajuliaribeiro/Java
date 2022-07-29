package relista6;

public class Sessao {
	private String data;
	private String horario;
	private int numeroIngressos;
	private Sala sala;
	private Filme filme;
	
	public Sessao(String data, String horario, int numeroIngressos, Sala sala, Filme filme) {
		super();
		this.data = data;
		this.horario = horario;
		this.numeroIngressos = numeroIngressos;
		this.sala = sala;
		this.filme = filme;
	}
	
	public void comprarIngressos(int ingressos) {
		if(ingressos > this.numeroIngressos) {
			System.out.println("Não foi possível concluir a sua compra. Número de ingressos indisponíveis.");
		}
		else {
			this.numeroIngressos -= ingressos;
			System.out.println("Compra concluída com sucesso!\n" + ingressos + " ingressos comprados.");
		}
	}
	
	public void imprimirRelatorio() {
		System.out.println("Data Sessão: " + this.data);
		System.out.println("Horário Sessão: " + this.horario);
		System.out.println("Ingressos disponíveis: " + this.numeroIngressos);
		System.out.println("Sala Sessão: " + this.sala.getNumeroIdentificacao());
		System.out.println("Capacidade Máxima Sala: " + this.sala.getCapacidadeMaxima());
		System.out.println("Título Filme: " + this.filme.getTitulo());
		System.out.println("Duração Filme: " + this.filme.getDuracao() + " minutos");
	}
}
