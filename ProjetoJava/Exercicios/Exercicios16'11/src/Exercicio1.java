
import java.util.*;

public class Exercicio1 {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int P,E = 50,M;
		
		System.out.println("Entre com o peso total dos tomates: ");
		P = ler.nextInt();
		if(P <= 50) {
			
			System.out.println("N�o h� valor excedente!");
			
		}
		
		else if(P > 50){
			
		E = P - 50;
		M = E * 4;
			
		System.out.println("Voc� excedeu o total em: " + E + " quilos."
				+ " O valor da multa a ser pago � de: " + M + " reais.");
		
		}
		
	}
	
	
}
