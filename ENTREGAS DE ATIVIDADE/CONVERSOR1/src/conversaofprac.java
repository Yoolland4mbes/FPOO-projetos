
import java.util.Scanner;

public class conversaofprac {
	


		public static void main(String[] args) {
			
			Scanner scanner = new Scanner (System.in);
			
			//double temperatura;
			double F, C;
			
			System.out.println("####---- BEM VINDO(a) AO PROGRAMA DE CONVERSÃO ----#### ");
			
			
			System.out.println("INFORME A TEMPERATURA EM GRAUS F");
			F = scanner.nextDouble();
			
			C = (F - 32)/ 1.8;
			
			System.out.println("RESULTADO " + C);
			

		}

	}

