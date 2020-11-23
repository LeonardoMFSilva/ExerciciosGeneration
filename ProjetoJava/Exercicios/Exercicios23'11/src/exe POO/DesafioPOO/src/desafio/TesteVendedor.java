package desafio;

public class TesteVendedor extends Pessoa{
	public static void main(String[] args) {
		Vendedor vend1 = new Vendedor("Ana", "rua aushaus", "999999", "888888", "12121", 10, 10);
		
		System.out.println("O nome do vendedor é " + vend1.getNome());
		System.out.println("Sua comissão é " + vend1.calcComissao());
	}
}
