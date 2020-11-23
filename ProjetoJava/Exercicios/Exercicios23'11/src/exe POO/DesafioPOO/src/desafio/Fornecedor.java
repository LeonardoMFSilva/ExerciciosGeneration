package desafio;

public class Fornecedor extends Pessoa{

	private float valorCredito;
	
	private float valorDivida;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome1, String endereco1, String telefone1, String cpf1, String rg1, float valorCredito,
			float valorDivida) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}	
	
	public float calcDif(){
		return valorCredito - valorDivida;
	}

}
