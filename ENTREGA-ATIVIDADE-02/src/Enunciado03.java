
public class Enunciado03 {
	
	private double Nota1, Nota2, Nota3, Nota4, Nota5, media1, media2;
	
	public void CaucularMedia() {
	if (media1() >= 7) {
		System.out.println("APROVADO");
	}
	
}
	public void CaucularMedia2() {
		if (media2() >= 7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}

	public double media1() {
		media1 = (getNota1() + getNota2() + getNota3() + getNota4())/4;
		return media1;
	}
	
	public double media2() {
		media1 = (getNota1() + getNota2() + getNota3() + getNota4() + getNota5())/5;
		return media2;
	}


	public double getNota1() {
		return Nota1;
	}
	
	public void setNota1(double nota1) {
		Nota1 = nota1;
	}

	public double getNota2() {
		return Nota2;
	}

	public void setNota2(double nota2) {
		Nota2 = nota2;
	}

	public double getNota3() {
		return Nota3;
	}

	public void setNota3(double nota3) {
		Nota3 = nota3;
	}

	public double getNota4() {
		return Nota4;
	}

	public void setNota4(double nota4) {
		Nota4 = nota4;
	}

	public double getNota5() {
		return Nota5;
	}

	public void setNota5(double nota5) {
		Nota5 = nota5;
	}
	
}