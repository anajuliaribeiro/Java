package lista5;

import java.util.Scanner;

public class TestaImovel {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Usado");
		System.out.print("Opção: ");
		
		Imovel imovel = null;
		int opcao = entrada.nextInt();
		
		// UPCASTING
		switch(opcao) {
			case 1:
				imovel = new ImovelNovo("Estrada das Rainhas, 1800. Cond. Jd. Primavera, Louveira - SP", 250000.00, 30000.00);
				break;
			case 2:
				imovel = new ImovelUsado("Rua Riacuelo, 570 . Apto 31, Centro - Ponta Grossa - PR", 100000.00, 11000.00);
				break;
		}
		
		imovel.imprimirDados();
		
		System.out.println("Downcasting");
		
		// DOWNCASTING
		if(imovel instanceof ImovelNovo) {
			
			ImovelNovo imovelNovo1 = (ImovelNovo) imovel;
			imovelNovo1.imprimirDados();
	
		} else {
			
			ImovelUsado imovelUsado1 = (ImovelUsado) imovel;
			imovelUsado1.imprimirDados();
		}
		entrada.close();
	}
		
}

