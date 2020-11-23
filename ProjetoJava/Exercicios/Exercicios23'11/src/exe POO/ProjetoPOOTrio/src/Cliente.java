
public class Cliente {
	
	private String nome; 
		
	private String sobrenome; 
	
	private int idade; 
	
	private int codigo;
	
	public Cliente (String nome1, String sobrenome1, int idade1, int codigo1) {
		nome = nome1;
		sobrenome = sobrenome1;
		idade = idade1;
		codigo = codigo1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
