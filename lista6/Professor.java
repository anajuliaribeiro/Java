package lista6;

public class Professor {
	private int registro;
	private String nome;
	private String titulacao;
	private Disciplina disciplina;
	private String dataAdmissao;
	private double salarioBase;
	private double gratificacao;
	
	public Professor(int registro, String nome, String titulacao, Disciplina disciplina, String dataAdmissao,
			double salarioBase, double gratificacao) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.titulacao = titulacao;
		this.disciplina = disciplina;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.gratificacao = gratificacao;
	}
	
	public double calcularSalario(double salarioBase, double gratificacao) {
		
		if (this.titulacao == "mestre") {
			this.gratificacao = 1000;
		}
		
		else {
			this.gratificacao = 2000;
		}
		
		return  this.salarioBase + this.gratificacao;
		
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

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	
}
