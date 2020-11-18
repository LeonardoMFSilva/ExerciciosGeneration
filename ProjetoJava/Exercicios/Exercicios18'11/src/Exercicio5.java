import java.util.*;

public class Exercicio5 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int x, contador = 0, soma = 0;
		float media = 0;

		do {
			System.out.printf("Entre com um número do teclado:");
			x = entrada.nextInt();
			if (x == 0) {
				System.out.println("Encerrando...");
				break;
			}

			else if (x % 3 == 0 && x > 0) {
				soma += x;
				contador++;
			}

		} while (true);
		
		media = (float) soma/contador;
		System.out.println("Media = " + media);

	}
}
