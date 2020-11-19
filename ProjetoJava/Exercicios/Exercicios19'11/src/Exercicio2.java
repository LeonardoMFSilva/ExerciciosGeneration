import java.util.*;

public class Exercicio2 {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		System.out.println("Matriz N1:");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("Insira o elemento N1[%d][%d]: ", linha + 1, coluna + 1);
				N1[linha][coluna] = ler.nextInt();
				System.out.printf("Insira o elemento N2[%d][%d]: ", linha + 1, coluna + 1);
				N2[linha][coluna] = ler.nextInt();
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}

		}

		System.out.println("Matriz M1:");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("[" + M1[linha][coluna] + "]\t");
			}
			System.out.println();
		}

		System.out.println("Matriz M2:");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("[" + M2[linha][coluna] + "]\t");
			}
			System.out.println();

		}

	}

}
