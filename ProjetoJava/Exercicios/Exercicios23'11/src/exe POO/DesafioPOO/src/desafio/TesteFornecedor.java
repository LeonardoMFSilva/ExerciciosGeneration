package desafio;

public class TesteFornecedor extends Pessoa {
	
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Andressa", "rua xsxs", "999999", "121232", "3123", 23, 5);
		
		System.out.println("O nome do fornecedor � " + fornecedor1.getNome());
		System.out.println("Valor do cr�dito � igual a " + fornecedor1.getValorCredito());
		System.out.println("Valor da d�vida � igual a " + fornecedor1.getValorDivida());
		System.out.println("A diferen�a � " + fornecedor1.calcDif());
	}

}
