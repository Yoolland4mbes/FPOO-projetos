import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
			EnunciadoTriangulos objEnunciadoTriangulo = new EnunciadoTriangulos();
		
				System.out.println("INFORME O PRIMEIRO LADO");
					objEnunciadoTriangulo.setLado1(objScanner.nextInt());
		
				System.out.println("INFORME O SEGUNDO LADO");
					objEnunciadoTriangulo.setLado2(objScanner.nextInt());
		
				System.out.println("INFORME O TERCEIRO LADO");
					objEnunciadoTriangulo.setLado3(objScanner.nextInt());
			
					objEnunciadoTriangulo.triangulos();
		
		
		
		
		
		
		
	}

}
