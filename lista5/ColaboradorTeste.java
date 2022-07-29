package lista5;

public class ColaboradorTeste {
	public static void main(String[] args) {
	
		Colaborador colaborador = null;
		//colaborador = new Funcionario("Ana","20/05/22",  "Rua Riachuelo", "Estudante", 1500.00);
		//colaborador = new Prestador("Ana", "20/05/22" ,"Rua Riachuelo", 150, "Programadora");
		//colaborador = new Empregado("Ana","20/05/22",  "Rua Riachuelo", "Estudante", 1500.00, 1);
		//colaborador = new Estagiario("Ana","20/05/22",  "Rua Riachuelo", "Estagiaria", 1500.00, 1);
		//colaborador = new Empresa("Ana", "20/05/22" ,"Rua Riachuelo", 150, "Programadora", 159357753);
		colaborador = new Autonomo("Ana", "20/05/22" ,"Rua Riachuelo", 150, "Programadora", 484765688);
		
		
		
		colaborador.imprimirDados();
	}
}
