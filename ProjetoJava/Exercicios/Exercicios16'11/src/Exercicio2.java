
import java.util.*;

public class Exercicio2 {
	
	public static void main (String args[]) {
				
		Scanner ler = new Scanner (System.in);
		int C,N,E,S;
		
		System.out.printf("Entre com o c�dgio do funcion�rio: ");
		C = ler.nextInt();
		System.out.printf("Entre com a quantidade de horas trabalhadas: ");
		N = ler.nextInt();
		
		if(N>50) {
			
			E = (N - 50) * 20;
			S = (50 * 10) + E;
			System.out.println("O funcion�rio de c�d: " + C + ", excedeu suas horas. O valor de seu salario"
					+ " total � igual a: " + S + ",00 reais. O valor do sal�rio excedente �: " + E + ",00 reais.");
		}
		else {
			
			S = N * 10;
			System.out.println("O funcion�rio de c�d: " + C + ", n�o excedeu horas. O valor de seu sal�rio �"
					+ " de: " + S + ",00 reais.");
		}
	}

}
