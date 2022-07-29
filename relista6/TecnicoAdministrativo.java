package relista6;

public class TecnicoAdministrativo {
	public int registro;
	public String  nome;
	public String dataAdmissao;
	public double salarioBase;
	public double adicionalNoturno;
	public Processo processo;
	
	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno, Processo processo) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.adicionalNoturno = adicionalNoturno;
		this.processo = processo;
	}

	public double calcularSalario(double salarioBase, double adicionalNoturno) {
		return this.salarioBase + this.adicionalNoturno;
	}
	
	public void imprimirRelatorio() {
		System.out.println("=====================================================================");
		System.out.println("INFORMAÇÕES TÉCNICO");
		System.out.println("Registro técnico: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admissão: " + this.dataAdmissao);
		System.out.println("Salário total: " + this.calcularSalario(salarioBase, adicionalNoturno));
		System.out.println("Número de processos: " + this.processo.getNumero());
		System.out.println("Data de criação: " + this.processo.getDataCriacao());
		System.out.println("Descrição Processo: " + this.processo.getDescricao());
		System.out.println("=====================================================================");
	}
	
	public int getRegistro() {
		return registro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public Processo getProcesso() {
		return processo;
	}
	
	
	
}
