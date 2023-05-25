package enunciado3;

import java.util.Scanner;
public class consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		double T, V = 0, D,L;
		
		System.out.println("####---- BEM VINDO(a) AO PROGRAMA DE CAUCULO DE CONSUMO ----#### ");
		
		System.out.println("INFORME O TEMPO DE VIAGEM GASTO");
		T= scanner.nextDouble();
		
		System.out.println("INFORME A VELOCIDADE MEDIA PERCORRIDA");
		V = scanner.nextDouble();
		
		D = T * V;
		
		L = D / 12;
		
		System.out.println("Litros Utilizados = " + L );
		System.out.println("####---- AGRADECEMOS PELA PREFERENCIA---###");
		
		

	}

}
