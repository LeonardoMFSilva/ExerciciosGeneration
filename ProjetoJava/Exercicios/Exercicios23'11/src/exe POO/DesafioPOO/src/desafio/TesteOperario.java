package desafio;

public class TesteOperario extends Pessoa{
	public static void main(String[] args) {
		Operario operario1 = new Operario("Andy", "rua aushaus", "999999", "888888", "12121", 10, 10);
		
		System.out.println("O nome do operário é " + operario1.getNome());
		System.out.println("O valor da comissão é R$ " + operario1.calcComissao());
			
	}

}
