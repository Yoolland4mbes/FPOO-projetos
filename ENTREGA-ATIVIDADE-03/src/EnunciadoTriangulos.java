
public class EnunciadoTriangulos {
	int lado1;
	int lado2;
	int lado3;
	
	public void triangulos() {
			
		if((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("ESTE TRIÂNGULO É EQUILÁTERO");
	
		}
		if ((lado1 == lado2) && (lado1 != lado3)) {
			System.out.println("ESTE TRIÂNGULO É ISÓSCELES");
			
			}
		if((lado1 != lado2) && (lado1 != lado3)) {
			System.out.println("TRIÂNGULO É ESCALENO");
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
