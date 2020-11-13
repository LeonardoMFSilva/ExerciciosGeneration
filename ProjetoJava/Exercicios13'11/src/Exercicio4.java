import java.util.Scanner;
public class Exercicio4 {
	public static void main(String arg[]) {
		
		Scanner ler = new Scanner(System.in);
		int segundosEntra,segundosSai,minutos,horas;
		
		System.out.println("Duração de evento em segundos: ");
		segundosEntra = ler.nextInt();
		
		if(segundosEntra >= 3600){
		
		horas = segundosEntra / 3600;
		segundosSai = segundosEntra % 3600;
		minutos = (segundosEntra / 60) - 60;
		segundosSai = segundosEntra % 60;
		
		System.out.println("Horas: " + horas + "\n" + "Minutos: " + minutos + "\n" + "Segundos: " + segundosSai);
			
		}else{
			minutos = segundosEntra / 60 ;
			segundosSai = segundosEntra % 60;
			
	    System.out.println("Horas: 0 "  + "\n" + "Minutos: " + minutos + "\n" + "Segundos: " + segundosSai);	
			
			
		}
			
			
		}

}