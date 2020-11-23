public class Entrada {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Andressa", "Amorim", 26, 1234);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSobrenome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getCodigo());
	}
}
