import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int[] dado = new int[10];
		int soma = 0, i = 0, comp = 0, maiorNumero = 0, contador = 0;
		float media = 0;

		for (i = 0; i < 10; i++) {

			System.out.printf("Entre com o valor do dado: ");
			comp = ler.nextInt();
			while (comp < 1 || comp > 6) {
				System.out.printf("Insira um valor entre 1 e 6: ");
				comp = ler.nextInt();

			}
			dado[i] = comp;
			soma = soma + dado[i];
			if (dado[i] > maiorNumero) {

				maiorNumero = dado[i];
			}

		}
		media = (float) soma / dado.length;
		for (i = 0; i < 10; i++) {
			if (maiorNumero == dado[i]) {
				contador++;
			}
			System.out.print("[");
			System.out.print(dado[i]);
			System.out.print("]");
		}
		System.out.println("\nMédia: " + media);
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("quantas vezes apareceu maior número: " + contador);

	}

}