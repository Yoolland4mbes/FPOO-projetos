
public class DadosContatos {
	
	private String email;
	private String telefone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println("EMAIL É OBRIGATORIO");
			System.exit(0);
		} else {
			this.email = email;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.isEmpty()) {
			System.out.println("TELEFONE É OBRIGATORIO");
			System.exit(0);
		} else{
			if(telefone.length()<=15) {
				this.telefone = telefone;
		} else {
			System.out.println("MINIMO 14 CARACTERES");
			System.exit(0);
			}
		}
	}
	

}
