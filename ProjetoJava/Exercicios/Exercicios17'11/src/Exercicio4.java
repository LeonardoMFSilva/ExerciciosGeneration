import java.util.*;
public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int L,H;
		double C,A;
		
		System.out.printf("Numero de lado: ");
		L = ler.nextInt();
		System.out.printf("Medida dos lados em cm: ");
		C = ler.nextDouble();
		
		if(L == 3) {
			System.out.printf("Esse pol�gono � um tri�ngulo. Digite o valor da altura: ");
			H = ler.nextInt();
			A = (C * H)/2;
			System.out.println("Seu pol�gono � um tri�ngulo de �rea: " + A + ".");
		}
		else if(L == 4) {
			A = C * C;
			System.out.println("Seu pol�gono � um quadrado de �rea: " + A + ".");
		}
		else if(L == 5) {
			System.out.println("Seu pol�gono � um pent�gono.");
		}
	}
	
}
