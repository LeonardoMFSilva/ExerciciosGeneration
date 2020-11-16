import java.util.*;
public class Exercicio7 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		float B,H,A;
		System.out.printf("Digite o valor da base: ");
		B = ler.nextFloat();
		System.out.printf("Digite o valor da altura: ");
		H = ler.nextFloat();
		if (B > 0 && H > 0) {
			
			A = (B * H)/2;
			System.out.println("Esse é o valor do triângulo: " + A + ".");
		}
		else {
			System.out.println("Valores inválidos.");
		}
	}
}
