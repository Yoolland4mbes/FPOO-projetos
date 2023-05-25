import java.util.Scanner;


public class Main05 {

	public static void main(String[] args) {
		
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado05 objEnunciado05 = new Enunciado05();
		
		
		System.out.println("INFORME UM NÚMERO");
		objEnunciado05.setN1(objScanner.nextInt());
		
		System.out.println("INFORME UM OUTRO NÚMERO");
		objEnunciado05.setN2(objScanner.nextInt());
		
		System.out.println("INFORME UM OPERADOR");
		objEnunciado05.setOperador(objScanner.next());
		
		objEnunciado05.Calculadora();
		
		System.out.println("RESULTADO:" + objEnunciado05.getResultado());
		
		
		
		
			
			}

		}

