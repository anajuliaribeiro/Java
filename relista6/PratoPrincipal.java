package relista6;

public class PratoPrincipal {
	public int id;
	public String nome;
	public String descricao;
	public double precoUnitario;
	
	public PratoPrincipal(int id, String nome, String descricao, double precoUnitario) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
}
