package lista6;

public class TecnicoAdministrativo {
	private int registro;
	private String nome;
	private String dataAdmissao;
	private double salarioBase;
	private double adicionalNoturno;
	private ProcessoInstituicao processoInstituicao;
	
	
	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno, ProcessoInstituicao processoInstituicao) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.adicionalNoturno = adicionalNoturno;
		this.processoInstituicao = processoInstituicao;
	}
	
	public double calcularSalario(double salarioBase, double adicionalNoturno) {
		return this.adicionalNoturno + this.salarioBase;
		
	}

	public void imprimirRelatorio() {
		System.out.println("=====================================================================");
		System.out.println("INFORMA��ES T�CNICO");
		System.out.println("Registro t�cnico: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admiss�o: " + this.dataAdmissao);
		System.out.println("Sal�rio total: " + this.calcularSalario(salarioBase, adicionalNoturno));
		System.out.println("N�mero de processos: " + this.processoInstituicao.getNumero());
		System.out.println("Data de cria��o: " + this.processoInstituicao.getDataCriacao());
		System.out.println("Descri��o Processo: " + this.processoInstituicao.getDescricao());
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

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public ProcessoInstituicao getProcessoInstituicao() {
		return processoInstituicao;
	}

	public void setProcessoInstituicao(ProcessoInstituicao processoInstituicao) {
		this.processoInstituicao = processoInstituicao;
	}
	
	
}
