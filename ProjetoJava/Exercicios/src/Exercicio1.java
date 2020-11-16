import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float a,b,c,media;
		System.out.println("Entre com o valor da primeira nota: ");
		a = ler.nextFloat();
		System.out.println("Entre com o valor da segunda nota: ");
		b = ler.nextFloat();
		System.out.println("Entre com o valor da terceira nota: ");
		c = ler.nextFloat();
		media = ((2 * a) + (3 * b) + (5 * c))/ (2 + 3 + 5);
		System.out.println("A média do aluno é igual a: " + media);
	}
	
}
