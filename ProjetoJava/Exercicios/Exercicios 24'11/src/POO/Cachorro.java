package POO;

public class Cachorro extends Animal{
		
	public Cachorro (String nome, String idade) {
		super(nome, idade);
		
	}
	
	
	@Override
	
	public String acaoFeita() {
		
		return "Correr";
	}
	
	@Override
	public String somEmitido() {
		
		return "Latido";
	}

	/* @Override
	
	public String SomEmitido() {
		
		return "Latido";
	} */
	
}
