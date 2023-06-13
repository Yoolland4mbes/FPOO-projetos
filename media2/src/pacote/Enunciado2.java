package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Enunciado2 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner (System.in);
		String produtos;
		
		double valor =0, quantidade;
		
		produtos = JOptionPane.showInputDialog("DIGITE O CODIGO DO SEU(S) PRODUTOS");
		switch(produtos){
		
		
		
		case "A001":
		quantidade = Double.parseDouble (JOptionPane.showInputDialog("QTDE DE PRODUTOS"));
		valor = quantidade * 7.50;
		break;
		
		
		
		
		case "A002":	
		quantidade = Double.parseDouble (JOptionPane.showInputDialog("QTDE DE PRODUTOS"));	
		valor = quantidade * 9.90;
		break;
		
		
		
			
		case "A003":
		quantidade = Double.parseDouble (JOptionPane.showInputDialog("QTDE DE PRODUTOS"));	
		valor = quantidade * 14.00;
		break;
	
		
		
		
		
		case "A004":
		quantidade = Double.parseDouble (JOptionPane.showInputDialog("QTDE DE PRODUTOS"));	
		valor = quantidade * 19.99;
		break;	
		
		
		
		default:
		break;
		}
		JOptionPane.showMessageDialog(null, "TOTAL:" + valor);
		
	}

}
 