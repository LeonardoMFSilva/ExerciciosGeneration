import java.util.*;
public class Exercicio1 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int A,B;
		
		System.out.printf("Entre com um número: ");
		A = ler.nextInt();
		System.out.printf("Entre com outro número: ");
		B = ler.nextInt();
		if(B == A) {
			System.out.println("O valor digitado não pode ser igual ao primeiro digitado.");
		}
		else if(A > B) {
			System.out.println("O maior valor é: " + A + ".");
		}
		else {
			System.out.println("O maior valor é: " + B + ".");
		}
	}
}
