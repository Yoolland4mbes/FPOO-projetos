
public class DadosPessoais {
	
	private String Nome;
	
	public String getNome() {
			return Nome;
	}
		
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			System.out.println("NOME É OBRIGATORIO");
			System.exit(0);
		} else{
			if(nome.length()>=3) {
			this.Nome = nome;
			} else {
				System.out.println("MINIMO 3 CARACTERES");
				System.exit(0);
			}
		}
	}
	
	private String sobreNome;
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		if(sobreNome.isEmpty()) {
			System.out.println("SOBRENOME É OBRIGATORIO");
			System.exit(0);
		} else{
			if(sobreNome.length()>=3) {
		this.sobreNome = sobreNome;
		} else {
			System.out.println("MINIMO 3 CARACTERES");
			System.exit(0);
			}
		}
	}
	
	private String dataNascimento;
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.isEmpty()) {
			System.out.println("DATA DE NASCIMENTO É OBRIGATORIO");
			System.exit(0);
		} else{
			if(dataNascimento.length()==10) {
		this.dataNascimento = dataNascimento;
		} else {
			System.out.println("MINIMO 10 CARACTERES");
			System.exit(0);
			}
		}
	}
		

	private String Genero;
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero( String Genero) {
		
		if(Genero.isEmpty()) {
			System.out.println("GENERO É OBRIGATORIO");
		} else {
			
			if(Genero.equalsIgnoreCase("FEMININO")) {
			this.Genero = Genero;
			
		} else {
			
			if(Genero.equalsIgnoreCase("MASCULINO")) {
				this.Genero = Genero;
			}else {
				if(Genero.equalsIgnoreCase("OUTROS")) {
					this.Genero = Genero;
				}else {
					System.out.println("GENERO INVALIDO");
					System.exit(0);
				}
			}
			
			}
		}
			
	}

}
			
		
			
				

