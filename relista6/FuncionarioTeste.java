package relista6;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina(48, "POO", "Programação Orient. Obj", 45);
		Professor professor1 = new Professor(22, "Ana", "mestre", "22/02", 1250, 1000, disciplina1);
		Processo processo1 = new Processo(21, "21/02", "Processo inst");
		TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo(21, "Alessandra", "20/05", 2800, 800, processo1);
		
		professor1.imprimirRelatorio();
		tecnico1.imprimirRelatorio();
		
	}
}
