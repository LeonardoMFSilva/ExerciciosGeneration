package desafio;

public class TesteEmpregado extends Pessoa{
	
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Andy", "rua aushaus", "999999", "888888", "12121", 333, 1234, 3);
		
		System.out.println("O nome do empregado � " + empregado1.getNome());
		System.out.println("Seu sal�rio � " + empregado1.calcSalario());
	}

}
