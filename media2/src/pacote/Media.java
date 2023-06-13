package pacote;

import java.util.Scanner;

public class Media {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int media;
			int nota1 = 7;
			int nota2 = 7;
			int nota3 = 7;
			int nota4 = 7;

			System.out.println("BEM VINDO AO NOSSO PROGRAMA DE MÉDIA ");

			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("Media: " + media);
			
			if (media > 7) {
				System.out.println("Aluno aprovado");
				
			}else if (media >=5 && media <=7) {
				System.out.println("Recuperação");
				}
			
			else if (media <5) {
				System.out.println("Reprovado");
			}
			
			System.out.println("OBRIGADO POR UTILIZAR O NOSSO PROGRAMA DE MÉDIA");
			
			}
		
		}
	

