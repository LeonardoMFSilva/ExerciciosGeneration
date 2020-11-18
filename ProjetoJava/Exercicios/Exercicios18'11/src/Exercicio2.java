import java.util.*;
public class Exercicio2 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		
		int numero, par = 0, impar = 0, x;
		
		for(x = 0; x < 10; x++) {
			System.out.printf("Entre com algum números: ");
			numero = ler.nextInt();
			
			if(numero %2 == 0) {
				par++;
		}
			else {
				impar++;
			}
			
		}
		System.out.println("O total de númeors pares são: " + par + ". " + 
				"E o total de números impares são: " + impar + ".");
			
		
	}
}
