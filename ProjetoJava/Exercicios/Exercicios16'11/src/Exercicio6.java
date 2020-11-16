import java.util.*;
public class Exercicio6 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int Idade;
		System.out.printf("Insira sua idade: ");
		Idade = ler.nextInt();
		if(Idade >= 5 && Idade <= 7) {
			System.out.println("Sua categoria é: Infantil A");
		}
		else if(Idade > 7 && Idade <= 11) {
			System.out.println("Sua categoria é: Infantil B");
		}
		else if(Idade > 11 && Idade <= 13) {
			System.out.println("Sua categoria é: Juvenil A");
		}
		else if(Idade > 13 && Idade <= 17) {
			System.out.println("Sua categoria é: Juvenil B");
		}
		else if(Idade >= 18) {
			System.out.println("Sua categoria é: Adulto");
		}
		else {
			System.out.println("Iti malia! Você ainda é um bebê e não há "
					+ " categoria para você.");
		}
	}
}
