import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float custoFabrica;
		double imposto, porcentagemDis, total;
		System.out.println("Entre com o valor do carro sem impostos: ");
		custoFabrica = ler.nextFloat();
		imposto = ler.nextFloat();
		imposto = 0.28 * custoFabrica;
		porcentagemDis = 0.45 * custoFabrica;
		total = (porcentagemDis + imposto + custoFabrica);
		System.out.println("Valor total do carro com impostos: " + total);
		
		
	}
	

}
