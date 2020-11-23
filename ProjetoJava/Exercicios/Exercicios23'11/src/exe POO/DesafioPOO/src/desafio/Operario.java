package desafio;

public class Operario extends Pessoa {
	
	private float valorProducao;
	
	private float salarioBaseOp;

	public Operario() {
		super();
	}

	public Operario(String nome1, String endereco1, String telefone1, String cpf1, String rg1, float valorProducao,
			float salarioBaseOp) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.valorProducao = valorProducao;
		this.salarioBaseOp = salarioBaseOp;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getSalarioBaseOp() {
		return salarioBaseOp;
	}

	public void setSalarioBaseOp(float salarioBaseOp) {
		this.salarioBaseOp = salarioBaseOp;
	}
	
	public float calcComissao(){
		return (salarioBaseOp*valorProducao) + salarioBaseOp;
	}	

}
