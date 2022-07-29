package lista4;

public class PetshopTeste {
	public static void main(String[] args) {
		
		Petshop cachorro1 = new Petshop("Teca", 15, "Marisa", "07559423884", "19993524626", "email@gmail.com", 
				"Estrada das Rainhas", 1800, "Ponte Preta", "Louveira", "São Paulo", "Pata quebrada", "10/05/22", "11/05/22");
		
		cachorro1.imprimirDadosCachorro();
		
		Petshop gato1 = new Petshop("Mia", 15, "Ana Julia", "48476568819", "19993524626", "email@gmail.com", 
				"Estrada das Rainhas", 1800, "Ponte Preta", "Louveira", "São Paulo", "Pata quebrada", "10/05/22", "11/05/22");
		
		gato1.imprimirDadosGato();
		
	}
}
