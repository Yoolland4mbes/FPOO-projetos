
public class Enunciado04 {
	private int n1, resto; 
	
	public void MaiorQueZero() {
		if(getN1()>0) {
			resto();
			if(resto == 0) {
				
				System.out.println("ESTE N�MERO � PAR");
				
			}else {
				System.out.println("ESTE N�MERO � IMPAR");
			}
		}else {
			
		System.out.println("DIGITE UM N�MERO MAIOR QUE 0");
			
			}
		
		}
	public void resto() {
		resto = (getN1()%2);
	}
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	}
