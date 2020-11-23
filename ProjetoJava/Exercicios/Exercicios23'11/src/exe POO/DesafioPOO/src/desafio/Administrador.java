package desafio;

public class Administrador extends Pessoa{
	
	private float ajudaViagem;
	
	private float ajudaEstadia;
	
	
	public Administrador() {
		super();
	}

	public Administrador(String nome1, String endereco1, String telefone1, String cpf1, String rg1, float ajudaViagem, float ajudaEstadia) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.ajudaViagem = ajudaViagem;
		this.ajudaEstadia = ajudaEstadia;
	}

	public float getAjudaViagem() {
		return ajudaViagem;
	}

	public void setAjudaViagem(float ajudaViagem) {
		this.ajudaViagem = ajudaViagem;
	}

	public float getAjudaEstadia() {
		return ajudaEstadia;
	}

	public void setAjudaEstadia(float ajudaEstadia) {
		this.ajudaEstadia = ajudaEstadia;
	}
	
	public float somaAjuda(){
		return ajudaViagem + ajudaEstadia;
	}

}
