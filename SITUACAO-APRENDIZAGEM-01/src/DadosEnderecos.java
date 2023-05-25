
public class DadosEnderecos {
	
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if(cep.isEmpty()) {
			System.out.println("CEP É OBRIGATORIO");
			System.exit(0);
		} else{
			if(cep.length()>=3) {
			this.cep = cep;
			} else {
				System.out.println("MINIMO 3 CARACTERES");
				System.exit(0);
			}
		}
	}
		
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if(logradouro.isEmpty()) {
			System.out.println("LOGRADOURO É OBRIGATORIO");
			System.exit(0);
		} else{
			if(logradouro.length()>=3) {
			this.logradouro = logradouro;
			} else {
				System.out.println("MINIMO 3 CARACTERES");
				System.exit(0);
			}
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if(numero.isEmpty()) {
			System.out.println("NUMERO É OBRIGATORIO");
			System.exit(0);
		} else {
		this.numero = numero;
		}
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.isEmpty()) {
			System.out.println("BAIRRO É OBRIGATORIO");
			System.exit(0);
		} else {
		this.bairro = bairro;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println("CIDADE É OBRIGATORIO");
			System.exit(0);
		} else {
		this.cidade = cidade;
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if(estado.isEmpty()) {
			System.out.println("ESTADO É OBRIGATORIO");
			System.exit(0);
		} else{
			if(estado.length()==2) {
				this.estado = estado;
		} else {
			System.out.println("MINIMO 2 CARACTERES");
			System.exit(0);
			}
		}
	}
	
}
