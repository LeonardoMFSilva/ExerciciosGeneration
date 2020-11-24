package POO;

public class Animal {

	private String nome;
	private String idade;
	//private String somEmitido;
	// private String acaoFeita;

	public Animal(String nome, String idade) {

		this.nome = nome;
		this.idade = idade;
		//this.somEmitido = somEmitido;
		// this.acaoFeita = acaoFeita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	/*public String getSomEmitido() {
		return somEmitido;
	}

	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}*/

	public String acaoFeita() {

		return null;

	}

	public String somEmitido() {
		
		return null;
	}

	/*
	 * public String getAcaoFeita() { return acaoFeita; }
	 * 
	 * public void setAcaoFeita(String acaoFeita) { this.acaoFeita = acaoFeita; }/*
	 * 
	 * /*public void somQueEmite() {
	 * 
	 * }
	 */

}
