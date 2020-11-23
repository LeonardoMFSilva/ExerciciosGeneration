package desafio;

public class Vendedor extends Pessoa{
	
	private float valorVendas;
	
	private float salarioBaseVend;

	
	public Vendedor(String nome1, String endereco1, String telefone1, String cpf1, String rg1, float valorVendas) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.valorVendas = valorVendas;
	}

	public Vendedor(String nome1, String endereco1, String telefone1, String cpf1, String rg1, float valorVendas,
			float salarioBaseVend) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.valorVendas = valorVendas;
		this.salarioBaseVend = salarioBaseVend;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getSalarioBaseVend() {
		return salarioBaseVend;
	}

	public void setSalarioBaseVend(float salarioBaseVend) {
		this.salarioBaseVend = salarioBaseVend;
	}
	
	public float calcComissao(){
		return (salarioBaseVend*valorVendas) + salarioBaseVend;
	}	

}
