package desafio;

public class TesteOperario extends Pessoa{
	public static void main(String[] args) {
		Operario operario1 = new Operario("Andy", "rua aushaus", "999999", "888888", "12121", 10, 10);
		
		System.out.println("O nome do oper�rio � " + operario1.getNome());
		System.out.println("O valor da comiss�o � R$ " + operario1.calcComissao());
			
	}

}
