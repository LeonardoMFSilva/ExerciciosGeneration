import java.util.*;

public class Exercicio8 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int N;
		System.out.printf("Insira um n�mero inteiro: ");
		N = ler.nextInt();
		if(N > 100) {
			
			System.out.println("O n�mero inserido foi de: " + N + ".");
		}
		else {
			N = 0;
			System.out.println("O n�mero inserido � igual: " + N + ".");
		}
		
	}

}
