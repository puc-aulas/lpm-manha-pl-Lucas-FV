package aplicacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar = 1;
		int opcaoMenu;
		
		while (continuar == 1) {
			
			System.out.println("1 - RECOMENDADÇÕES DE VISITAÇÃO ");
			System.out.println("2 - CHECAR ESTRADAS POSSÍVEIS ");
			System.out.println("3 - RECOMENDAÇÕES DE ROTAS ");

			opcaoMenu = scan.nextInt();
			
			switch (opcaoMenu) {
			
			case 1:
				
				break;
				
				
			case 2:
				
				break;
				
			case 3:
				
				break;
			
			}
			
			
			
			System.out.println("Voce deseja continuar?");
			continuar = scan.nextInt();
		}
		
		
		
	}

}
