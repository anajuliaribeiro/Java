package lista6;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		Disciplina poo = new Disciplina(22, "POO", "Programação", 40);
		Professor professor1 = new Professor(22015, "Ana Julia", "Doutor", poo, "28/05", 15000, 0);
		professor1.imprimirRelatorio();
		
		ProcessoInstituicao processo = new ProcessoInstituicao(5, "26/05", "Processo da Instituição");
		TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo(220150, "Juliana", "20/05", 1200, 500, processo);
		tecnico1.imprimirRelatorio();
	}
}
