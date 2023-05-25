import java.util.Scanner;
public class Main03 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado03 objEnunciado03 = new Enunciado03();
		
		System.out.println("INFORME A PRIMEIRA NOTA");
		objEnunciado03.setNota1(objScanner.nextDouble());
		
		System.out.println("INFORME A SEGUNDA NOTA");
		objEnunciado03.setNota2(objScanner.nextDouble());

		System.out.println("INFORME A TERCEIRA NOTA");
		objEnunciado03.setNota3(objScanner.nextDouble());
		
		System.out.println("INFORME A QUARTA NOTA");
		objEnunciado03.setNota4(objScanner.nextDouble());
		
		if (objEnunciado03.media1() >=7) {
			objEnunciado03.CaucularMedia();
		}else {
			System.out.println("INFORME A QUINTA NOTA");
			objEnunciado03.setNota5(objScanner.nextDouble());
				objEnunciado03.CaucularMedia2();
		}

	}

}
