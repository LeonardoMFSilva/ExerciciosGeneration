
public class Entrada2 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("AirBus", "Passageiros", "Gol", 150, true, true);
		
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getTipo());
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getQtdPassageiros());
		System.out.println(aviao1.isVooInter());
		System.out.println(aviao1.isAtivo());
	}
}
