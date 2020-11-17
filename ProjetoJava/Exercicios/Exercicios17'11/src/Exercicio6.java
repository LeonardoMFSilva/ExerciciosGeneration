import java.util.*;
public class Exercicio6 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int A,B,C;
		System.out.printf("Digite o primeiro número: ");
		A = ler.nextInt();
		System.out.printf("Digite o segudo número: ");
		B = ler.nextInt();
		System.out.printf("Digite o terceiro número: ");
		C = ler.nextInt();
		
		if(B == A || B == C || A == C) {
			System.out.println("Não são permitidos valores iguais.");
		}
		else if(A > B && A > C) {
			System.out.println("\nO maior valor digitado é: " + A);
		}
		else if(B > A && B > C) {
			System.out.println("\nO maior valor digitado é: " + B);
		}
		else if(C > B && C > A) {
			System.out.println("\nO maior valor digitado é: " + C);
		}
	}

}
