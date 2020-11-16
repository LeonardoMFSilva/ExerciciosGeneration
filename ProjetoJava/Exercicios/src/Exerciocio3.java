
import java.util.Scanner;

public class Exerciocio3 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,r,s;
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = ler.nextInt();
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s)/2;
		System.out.println("O Valor de R é = " + r + ". O valor de S é igual a: " + s + "."
				+ " O valor total da expressão é igual a: " + d);
	}

}
