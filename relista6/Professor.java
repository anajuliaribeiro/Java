package relista6;

public class Professor {
	public int registro;
	public String nome;
	public String titulacao;
	public String dataAdmissao;
	public double salarioBase;
	public int gratificacao;
	public Disciplina disciplina;
	
	public Professor(int registro, String nome, String titulacao, String dataAdmissao, double salarioBase,
			int gratificacao, Disciplina disciplina) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.titulacao = titulacao;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.gratificacao = gratificacao;
		this.disciplina = disciplina;
	}

	public double calcularSalario(double salarioBase, int gratificacao) {
		if(titulacao == "mestre") {
			this.gratificacao = 1000;
			
		}
		else {
			this.gratificacao = 2000;
		}
		return this.salarioBase + gratificacao;
	}

	public void imprimirRelatorio() {
		System.out.println("=====================================================================");
		System.out.println("INFORMAÇÕES PROFESSOR");
		System.out.println("Registro professor: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Titulação: " + this.titulacao);
		System.out.println("Disciplina: " + this.disciplina.getNome());
		System.out.println("Data de Admissão: " + this.dataAdmissao);
		System.out.println("Salário total: " + this.calcularSalario(salarioBase, gratificacao));
		System.out.println("Código Disciplina: " + this.disciplina.getCodigo());
		System.out.println("Ementa Disciplina: " + this.disciplina.getEmenta());
		System.out.println("Carga Horária Disciplina: " + this.disciplina.getCargaHoraria());
		System.out.println("=====================================================================");
	}
}