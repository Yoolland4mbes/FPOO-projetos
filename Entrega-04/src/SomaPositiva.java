import java.util.Scanner;
	public class SomaPositiva {
		public void soma() {
			
			Scanner objScanner = new Scanner(System.in);
			
			int sentinela=0;
			int soma=0;
			while (sentinela >=0) {
				System.out.println("DIGITE UM NUMERO: ");
				sentinela = objScanner.nextInt();{
					if(sentinela >=0) {
						soma = soma + sentinela;
						
					}
				}
				
			}
			System.out.println("ESSE É O RESULTADO DA SOMA" +soma);	
		}
		
}
