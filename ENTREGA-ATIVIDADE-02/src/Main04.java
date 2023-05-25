import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		Enunciado04 objEnunciado04 = new Enunciado04();
	 
		
		System.out.println("INFORME UM NÚMERO");
		objEnunciado04.setN1(objScanner.nextInt());

		objEnunciado04.MaiorQueZero();
	}

	}

