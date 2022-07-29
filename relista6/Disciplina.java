package relista6;

public class Disciplina {
	public int codigo;
	public String nome;
	public String ementa;
	public int cargaHoraria;
	
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

	public String getNome() {
		return nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	
}
