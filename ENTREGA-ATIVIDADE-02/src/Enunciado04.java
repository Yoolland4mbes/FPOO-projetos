
public class Enunciado04 {
	private int n1, resto; 
	
	public void MaiorQueZero() {
		if(getN1()>0) {
			resto();
			if(resto == 0) {
				
				System.out.println("ESTE NÚMERO É PAR");
				
			}else {
				System.out.println("ESTE NÚMERO É IMPAR");
			}
		}else {
			
		System.out.println("DIGITE UM NÚMERO MAIOR QUE 0");
			
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
