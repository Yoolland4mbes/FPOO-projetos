import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		//double temperatura;
		double C, F;
		
		System.out.println("####---- BEM VINDO(a) AO PROGRAMA DE CONVERSÃO ----#### ");
		
		
		System.out.println("INFORME A TEMPERATURA EM GRAUS C");
		C = scanner.nextDouble();
		
		F = (C * 1.8 + 32);
		
		System.out.println("RESULTADO " + F);
		

	}

}
