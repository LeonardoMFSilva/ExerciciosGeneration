package POO;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Animal Solly = new Cachorro ("Solly", "12 anos");
		Animal PeDePano = new Cavalo ("Pé de Pano", "15 anos"); 
		Animal Jair = new Preguica ("Jair", "60");
		
		System.out.println("Cachorro: " + Solly.getNome() + "\nIdade: " + Solly.getIdade() 
		+ "\nSom emitido: " + Solly.somEmitido() + "\nAção: " + Solly.acaoFeita() + "\n");
		
		System.out.println("Cavalo: " + PeDePano.getNome() + "\nIdade: " + PeDePano.getIdade() 
		+ "\nSom emitido: " + PeDePano.somEmitido() + "\nAção: " +  PeDePano.acaoFeita() + "\n");
		
		System.out.println("Preguiça: " + Jair.getNome() + "\nIdade: " + Jair.getIdade() 
		+ "\nSom emitido: " + Jair.somEmitido() + "\nAção: " +  Jair.acaoFeita() + "\n");
		
		
	}

}
