import java.util.*;

public class Exercicio8 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int N;
		System.out.printf("Insira um número inteiro: ");
		N = ler.nextInt();
		if(N > 100) {
			
			System.out.println("O número inserido foi de: " + N + ".");
		}
		else {
			N = 0;
			System.out.println("O número inserido é igual: " + N + ".");
		}
		
	}

}
