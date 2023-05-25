import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// começo enuciado 01
		
	Scanner objScanner = new Scanner(System.in);
		Enunciado01 objEnunciado01 = new Enunciado01();
		
		int n1, n2;
				System.out.println("INFORME O PRIMEIRO NUMERO:");
				n1 = objScanner.nextInt();
		
				System.out.println("INFORME O SEGUNDO NUMERO");
				n2= objScanner.nextInt();

	objEnunciado01.exibirMaior(n1, n2);
//fim enunciado 01
	
	
//começo enunciado 02
		Enunciado02 objEnunciado02 = new Enunciado02();
	
		int N1, N2, N3;
			System.out.println("INFORME O PRIMEIRO NUMERO:");
			N1 = objScanner.nextInt();
	
			System.out.println("INFORME O SEGUNDO NUMERO");
			N2= objScanner.nextInt();
			
			System.out.println("INFORME O TERCEIRO NUMERO");
			N3= objScanner.nextInt();


			objEnunciado02.mostrarMaior(N1, N2, N3);
//fim enunciado 02
			
			
//começo enunciado 03
			
	
		}


	}

