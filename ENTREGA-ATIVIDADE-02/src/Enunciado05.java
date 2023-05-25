
public class Enunciado05 {
	
	String Operador;
	int N1, N2, Resultado;
	
	public void Calculadora() {
		switch (getOperador()) {
		case"+":
			Resultado= getN1() + getN2();
			break;
			
		case"-":
			Resultado= getN1() - getN2();
			break;
			
		case"*":
			Resultado= getN1() * getN2();
			break;
			
		case"/":
			Resultado= getN1() / getN2();
			break;
			
		case"%":
			Resultado= getN1() % getN2();
			break;
		}
	}
	
	public String getOperador() {
		return Operador;
	}
	public void setOperador(String operador) {
		Operador = operador;
	}
	public int getN1() {
		return N1;
	}
	public void setN1(int n1) {
		N1 = n1;
	}
	public int getN2() {
		return N2;
	}
	public void setN2(int n2) {
		N2 = n2;
	}
	public int getResultado() {
		return Resultado;
	}
	public void setResultado(int resultado) {
		Resultado = resultado;
	}
}
