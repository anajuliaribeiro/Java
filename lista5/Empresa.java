package lista5;

public class Empresa extends Prestador{
	private long cnpj;

	public Empresa(String nome, String dataInicio, String endereco, double valorHora, String tipoServico, long cnpj) {
		super(nome, dataInicio, endereco, valorHora, tipoServico);
		this.cnpj = cnpj;
		
	}

	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CNPJ:" + this.cnpj);
		}
	

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + "]";
	}
	
	

}
