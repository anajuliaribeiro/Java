package lista6;

public class Disciplina {
	private int codigo;
	private String nome;
	private String ementa;
	private int cargaHoraria;
	
	
	public Disciplina(int codigo, String nome, String ementa, int cargaHoraria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmenta() {
		return ementa;
	}


	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
