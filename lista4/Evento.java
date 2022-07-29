package lista4;

public class Evento {
	protected String evento;
	protected Artista artista;
	protected String data;
	protected Local local;
	protected String classificacao;
	protected int ingresso;
	protected int nIngressos;
	
		
	public Evento(String evento, Artista artista, String data, Local local, String classificacao, int ingresso, int nIngressos) {
		super();
		this.evento = evento;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.classificacao = classificacao;
		this.ingresso = ingresso;
		this.nIngressos = nIngressos;
	}



	public void ingressos(int ingresso, int nIngressos) {
		 ingressos = this.getnIngressos() - (this.local.getCapacidade() - this.getIngresso())
		if  > 0{
			
		}
	}



	public String getEvento() {
		return evento;
	}



	public Artista getArtista() {
		return artista;
	}



	public String getData() {
		return data;
	}



	public Local getLocal() {
		return local;
	}



	public String getClassificacao() {
		return classificacao;
	}



	public int getIngresso() {
		return ingresso;
	}



	public int getnIngressos() {
		return nIngressos;
	}



	public void setnIngressos(int nIngressos) {
		this.nIngressos = nIngressos;
	}

	
	
}
