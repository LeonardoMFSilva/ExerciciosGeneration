import java.util.*;
public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		int x, soma = 0;
		
		do {
			System.out.printf("Entre com um número do teclado:");
			x = entrada.nextInt();
			if (x == 0) {
				System.out.println("Encerrando...");
				break;
			}

			else if (x < 0 || x > 9) {
				System.out.printf("\nDigite um valor válido!\n");
			} else {
				soma = soma + x;
			}

		}while (true);
		System.out.println("Soma = " + soma);

	}

}