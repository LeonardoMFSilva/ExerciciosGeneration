import java.util.*;
public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int N;
		System.out.printf("Entre com um valor: ");
		N = ler.nextInt();
		if(N %2 == 0 && N >= 0) {
			System.out.println("Valor par e positivo.");
		}
		else if(N %2 == 0 && N < 0) {
			System.out.println("Valor par e negativo.");
		}
		else if(N %2 != 0 && N > 0) {
			System.out.println("Valor ímpar e positivo.");
		}
		else if(N %2 != 0 && N < 0) {
			System.out.println("Valor ímpar e negativo.");
		}
		
	}
}
