package lista5;

public class Prestador extends Colaborador{
	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String dataInicio, String endereco, double valorHora, String tipoServico) {
		super(nome, dataInicio, endereco);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
		
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Hora: R$" + this.valorHora);
		System.out.println("Tipo Serviço: " + this.tipoServico);
		
		}
	@Override
	public String toString() {
		return "Prestador [valorHora=" + valorHora + ", tipoServico=" + tipoServico + "]";
	}
	
	
	
}
