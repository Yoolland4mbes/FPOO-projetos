
public class Enunciado02 {

	public void mostrarMaior(int N1, int N2, int N3) {
				
		if (N1 > N2) {
			if (N1 > N3)
			System.out.println("N1 � O MAIOR ");
		}else {
			if (N2 > N1) {
				if (N2 > N3)
				System.out.println("N2 � O MAIOR");
			}else {
				if (N3 > N1) {
					if (N3 > N2)
					System.out.println("N3 � O MAIOR");
				}
						
			}
			
		}
				
	}

}
