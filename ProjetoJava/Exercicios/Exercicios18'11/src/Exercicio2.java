import java.util.*;
public class Exercicio2 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		
		int numero, par = 0, impar = 0, x;
		
		for(x = 0; x < 10; x++) {
			System.out.printf("Entre com algum n�meros: ");
			numero = ler.nextInt();
			
			if(numero %2 == 0) {
				par++;
		}
			else {
				impar++;
			}
			
		}
		System.out.println("O total de n�meors pares s�o: " + par + ". " + 
				"E o total de n�meros impares s�o: " + impar + ".");
			
		
	}
}
