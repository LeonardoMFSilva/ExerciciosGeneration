import java.util.*;
public class Ex2Dia17Nov {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		int Senha;
		
		System.out.printf("Insira sua senha: ");
		Senha = entrada.nextInt();
		
		switch (Senha) {
		case 1234: System.out.println("Acesso Permitido!"); break;
		default: System.out.println("Acesso Negado!");
		}
	
	}
}