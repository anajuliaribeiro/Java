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
			System.out.println("N�o foi poss�vel concluir a sua compra. N�mero de ingressos indispon�veis.");
		}
		else {
			this.numeroIngressos -= ingressos;
			System.out.println("Compra conclu�da com sucesso!\n" + ingressos + " ingressos comprados.");
		}
	}
	
	public void imprimirRelatorio() {
		System.out.println("Data Sess�o: " + this.data);
		System.out.println("Hor�rio Sess�o: " + this.horario);
		System.out.println("Ingressos dispon�veis: " + this.numeroIngressos);
		System.out.println("Sala Sess�o: " + this.sala.getNumeroIdentificacao());
		System.out.println("Capacidade M�xima Sala: " + this.sala.getCapacidadeMaxima());
		System.out.println("T�tulo Filme: " + this.filme.getTitulo());
		System.out.println("Dura��o Filme: " + this.filme.getDuracao() + " minutos");
	}
}
