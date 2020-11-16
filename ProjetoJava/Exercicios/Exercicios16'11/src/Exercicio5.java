import java.util.*;
public class Exercicio5 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		float Indice;
		System.out.printf("Entre com o valor do Índice: ");
		Indice = ler.nextFloat();
		if(Indice >= 0.3 && Indice < 0.4) {
			System.out.println("Intimar e suspender o primeiro grupo de empresas.");
		}
		else if(Indice >= 0.4 && Indice < 0.5) {
			System.out.println("Intimar e suspender primeiro e segundo grupo de emrpesas.");
		}
		else if (Indice >= 0.5) {
			System.out.println("Intimar e paralisar a atividades de todos os grupos de"
					+ " empresas");
		}
		else if (Indice > 0.25 && Indice <= 0.29) {
			System.out.println("Emitir sinal de alerta!");
		}
		else if(Indice <= 0.25) {
			System.out.println("Parâmetros estão ok.");
		}
		
	}
}
