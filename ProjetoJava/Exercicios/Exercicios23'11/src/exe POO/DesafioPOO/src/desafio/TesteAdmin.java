package desafio;

public class TesteAdmin extends Pessoa{

	public static void main(String[] args) {
		Administrador adm1 = new Administrador("Leo", "ssss", "312122", "5454554", "232323", 10, 10);
		
		System.out.println("O nome do administrador � " + adm1.getNome());
		System.out.println("Seu sal�rio � " + adm1.somaAjuda());
	}
}
