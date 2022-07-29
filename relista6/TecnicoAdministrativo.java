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
		System.out.println("INFORMA��ES T�CNICO");
		System.out.println("Registro t�cnico: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admiss�o: " + this.dataAdmissao);
		System.out.println("Sal�rio total: " + this.calcularSalario(salarioBase, adicionalNoturno));
		System.out.println("N�mero de processos: " + this.processo.getNumero());
		System.out.println("Data de cria��o: " + this.processo.getDataCriacao());
		System.out.println("Descri��o Processo: " + this.processo.getDescricao());
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
