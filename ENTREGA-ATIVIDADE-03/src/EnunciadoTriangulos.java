
public class EnunciadoTriangulos {
	int lado1;
	int lado2;
	int lado3;
	
	public void triangulos() {
			
		if((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("ESTE TRI�NGULO � EQUIL�TERO");
	
		}
		if ((lado1 == lado2) && (lado1 != lado3)) {
			System.out.println("ESTE TRI�NGULO � IS�SCELES");
			
			}
		if((lado1 != lado2) && (lado1 != lado3)) {
			System.out.println("TRI�NGULO � ESCALENO");
				}
			
			
			}
		
			
		

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	
					
}
