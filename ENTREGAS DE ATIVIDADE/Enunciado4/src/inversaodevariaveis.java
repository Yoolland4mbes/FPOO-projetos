import java.util.Scanner;

public class inversaodevariaveis {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double a1, b1, a2, b2;
		
		System.out.println ("INFORME O VALOR DE A");
		a1 = scanner.nextDouble();
		
		System.out.println ("INFORME O VALOR DE B");
		b1 = scanner.nextDouble();
		
		a2 = b1;
		b2 = a1;
		
		System.out.println("VALOR DE A: " + a2);
		System.out.println("VALOR DE B: " + b2);
		System.out.println("AGRADECEMOS A PREFERENCIA PELO NOSSO SITE");
		
     }
}


