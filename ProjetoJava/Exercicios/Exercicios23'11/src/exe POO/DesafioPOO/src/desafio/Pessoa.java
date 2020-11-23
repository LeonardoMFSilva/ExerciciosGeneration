package desafio;

public class Pessoa {

	private String nome; 
	
	private String endereco; 
	
	private String telefone;
	
	private String cpf;
	
	private String rg;
	
	public Pessoa (String nome1, String endereco1, String telefone1, String cpf1, String rg1) {
		nome = nome1;
		endereco = endereco1;
		telefone = telefone1;
		cpf = cpf1;
		rg = rg1;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}

