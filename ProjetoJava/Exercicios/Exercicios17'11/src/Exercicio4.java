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
			System.out.printf("Esse polígono é um triângulo. Digite o valor da altura: ");
			H = ler.nextInt();
			A = (C * H)/2;
			System.out.println("Seu polígono é um triângulo de área: " + A + ".");
		}
		else if(L == 4) {
			A = C * C;
			System.out.println("Seu polígono é um quadrado de área: " + A + ".");
		}
		else if(L == 5) {
			System.out.println("Seu polígono é um pentágono.");
		}
	}
	
}
