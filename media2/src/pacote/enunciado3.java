package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class enunciado3 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		
		String codigo;
		
		double salario = 0, total =0, x, y;
		
		codigo = JOptionPane.showInputDialog("DIGITE O CODIGO REFERENTE AO SEU CARGO:");
		salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SAL�RIO:"));
		switch (codigo) {
		
		
		
			case "1":
			y = salario;
			x = y / 100;
			total = salario + (x * 50);
			JOptionPane.showMessageDialog(null, "CARGO: ESCRITU�RIO" + "-SEU ATUAL SAL�RIO " + total + " AUMENTO DE 50%");
		    break;
			
			case "2":
			y = salario;
			x = y / 100;
			total = salario + (x * 35);
			JOptionPane.showMessageDialog(null, "CARGO: SECRET�RIO" + "-SEU ATUAL SALARIO " + total + " AUMENTO DE 35%");
			break;

			
			
			
			
			case "3":
			y = salario;
			x = y / 100;
			total = salario + (x * 20);		
			JOptionPane.showMessageDialog(null, "CARGO: CAIXA" + "- SEU ATUAL SAL�RIO " + total + " AUMENTO DE 20%");
			break;

			
			
			
			
			case "4":
			y = salario;
			x = y / 100;
			total = salario + (x * 10);
			JOptionPane.showMessageDialog(null, "CARGO: GERENTE" + " - SEU ATUAL SAL�RIO " + total + " AUMENTO DE 10%");
			break;
	
			
			
			
			case "5":
			total = salario;
			JOptionPane.showMessageDialog(null, "CARGO: DIRETOR" + " - SEU ATUAL SAL�RIO " + total + " SEU CARGO N�O TEVE NENHUM AUMENTO");
			break;
			
			
			
			
			default:
				break;
			
		}
		

	}
}
