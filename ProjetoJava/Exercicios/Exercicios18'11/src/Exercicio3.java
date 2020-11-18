import java.util.*;
public class Exercicio3 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int Idade = 0, Menor21 = 0, Maior50 = 0;
		
	
		
		while(Idade != -99) {
			System.out.printf("Entre com sua idade: ");
			Idade = ler.nextInt();
			
			if(Idade < 21 && Idade > 0) {
				Menor21++;
			}
			else if (Idade > 50) {
				Maior50++;
			}
			
		}
		System.out.println("Pessoas menor que 21 anos: " + Menor21 + " e pessoas com"
				+ " mais de 50 anos: " + Maior50 + ".");
		
	}
}
