import java.util.*;
public class Exercicio3 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int A,B,C,D,QA,QB,QC,QD;
		
		System.out.printf("Digite o primeiro número: ");
		A = ler.nextInt();
		System.out.printf("Digite o segundo número: ");
		B = ler.nextInt();
		System.out.printf("Digite o terceiro número: ");
		C = ler.nextInt();
		System.out.printf("Digite o quarto número: ");
		D = ler.nextInt();
		
		QA = A * A;
		QB = B * B;
		QC = C * C;
		QD = D * D;
		
		if(QC >= 1000) {
		System.out.println("O quadrado de " + C + " é igual a: " + QC);
		}
		else {
			System.out.println("Números lidos: " + A + ", " + B + ", " + C + ", " + D + ". "
					+ "Seus respectivos quadrados: " + QA + ", " + QB + ", " + QC + ", " + QD + ".");
		}
	}

}
