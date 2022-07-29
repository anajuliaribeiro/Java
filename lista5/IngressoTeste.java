package lista5;

public class IngressoTeste {
	public static void main(String[] args) {
		
		Ingresso ingresso = null;
		//ingresso = new IngressoNormal(30.0,"Normal");
		ingresso = new CamaroteInferior(25, "VIP",0, "CI");
		//ingresso = new CamaroteSuperior(25, "VIP", 0, "CS");
				
		ingresso.imprimirDadosIngresso();
	}
}
