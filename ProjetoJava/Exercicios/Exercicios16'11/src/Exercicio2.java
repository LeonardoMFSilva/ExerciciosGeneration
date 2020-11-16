
import java.util.*;

public class Exercicio2 {
	
	public static void main (String args[]) {
				
		Scanner ler = new Scanner (System.in);
		int C,N,E,S;
		
		System.out.printf("Entre com o códgio do funcionário: ");
		C = ler.nextInt();
		System.out.printf("Entre com a quantidade de horas trabalhadas: ");
		N = ler.nextInt();
		
		if(N>50) {
			
			E = (N - 50) * 20;
			S = (50 * 10) + E;
			System.out.println("O funcionário de cód: " + C + ", excedeu suas horas. O valor de seu salario"
					+ " total é igual a: " + S + ",00 reais. O valor do salário excedente é: " + E + ",00 reais.");
		}
		else {
			
			S = N * 10;
			System.out.println("O funcionário de cód: " + C + ", não excedeu horas. O valor de seu salário é"
					+ " de: " + S + ",00 reais.");
		}
	}

}
