import java.util.*;
public class Exercicio6 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int A,B,C;
		System.out.printf("Digite o primeiro n�mero: ");
		A = ler.nextInt();
		System.out.printf("Digite o segudo n�mero: ");
		B = ler.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
		C = ler.nextInt();
		
		if(B == A || B == C || A == C) {
			System.out.println("N�o s�o permitidos valores iguais.");
		}
		else if(A > B && A > C) {
			System.out.println("\nO maior valor digitado �: " + A);
		}
		else if(B > A && B > C) {
			System.out.println("\nO maior valor digitado �: " + B);
		}
		else if(C > B && C > A) {
			System.out.println("\nO maior valor digitado �: " + C);
		}
	}

}
