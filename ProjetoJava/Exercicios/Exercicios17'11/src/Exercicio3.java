import java.util.*;
public class Exercicio3 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner (System.in);
		double A;
		
		System.out.printf("Quantas ma�as foram compradas: ");
		A = ler.nextDouble();
		
		if(A <= 3)
		{
			A = A * 0.30;
			System.out.println("O valor a ser pago � de: " + A + " centavos.");
		}
		
		else if(A < 12 && A > 3) {
			A = A * 0.30;
			System.out.println("O valor total a ser pago �: " + A + " reais.");
			
		}
		else if(A >= 12) {
			A = A * 0.25;
			System.out.println("O valor total a ser pago �: " + A + " reais.");
		}
		
	}
}
