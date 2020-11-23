package desafio;

public class Empregado extends Pessoa{
	
	int codigoSetor;
	
	float salarioBase;
	
	float imposto;

	public Empregado() {
		super();
	}

	public Empregado(String nome1, String endereco1, String telefone1, String cpf1, String rg1, int codigoSetor,
			float salarioBase, float imposto) {
		super(nome1, endereco1, telefone1, cpf1, rg1);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public float calcSalario(){
		return (salarioBase*imposto) - salarioBase;
	}	

}
