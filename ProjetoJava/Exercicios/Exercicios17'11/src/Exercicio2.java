import java.util.*;
public class Exercicio2 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int Senha;
		
		System.out.printf("Entre com a sua senha: ");
		Senha = ler.nextInt();
		
		if(Senha == 1234) {
			System.out.println("Acesso permitido!");
		}
		else {
			System.out.println("Senha inválida. Acesso negado!");
		}
	}
}
