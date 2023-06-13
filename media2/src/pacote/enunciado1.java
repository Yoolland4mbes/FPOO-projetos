package pacote;

import java.util.Scanner;

public class enunciado1 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		String Planos;
		
		System.out.println("Digite seu plano");
		
		Planos = objScanner.next();
		
		if (Planos.equalsIgnoreCase("Básico")) {
			 System.out.println("R$ 150,00");
		}
		
		else if (Planos.equalsIgnoreCase("Bronze")) {
			System.out.println("R$ 220,00");
		}
		
		else if (Planos.equalsIgnoreCase("Prata")) {
			 System.out.println("R$ 310,00");
		}
		

		else if (Planos.equalsIgnoreCase("Ouro")) {
			 System.out.println("R$ 450,00");

		}
		
		else {
			System.out.println("PLANO INVÁLIDO");
		}

	}
}
