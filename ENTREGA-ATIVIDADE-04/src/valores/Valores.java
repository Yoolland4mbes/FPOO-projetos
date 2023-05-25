package valores;
import java.util.Scanner;

public class Valores {

	int[] valor1 = new int [10];
	int[] valor2 = new int [10];
	
	Scanner objScanner = new Scanner(System.in);
	
	public void ValoresNumericos() {
		 int cont = 0;
		 while(cont < valor1.length) {
			 
			 System.out.println("DIGITE UM VALOR " + (cont + 1));
			 valor1[cont] = objScanner.nextInt();
			 cont++;
		
		 cont = 0;
		 while(cont < valor1.length) {
			 valor2[cont] = valor1 [cont] * 3;
			 cont++;
		 }
		 System.out.println("LISTAGEM DOS VALORES");
		 cont = 0;
		 while(cont < valor1.length) {
			 
			 System.out.println((cont + 1) + "VALORES: " + valor1[cont]);
			 System.out.println((cont + 1) + "VALORES: " + valor2[cont]);
			 cont++;
		 }
	}
}