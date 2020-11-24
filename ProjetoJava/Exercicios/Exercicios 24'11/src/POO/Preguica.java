package POO;

public class Preguica extends Animal {

	public Preguica(String nome, String idade) {

		super(nome, idade);

	}

	@Override

	public String acaoFeita() {

		return "Fazer nada";
	}

	@Override
	public String somEmitido() {
		
		return "Incógnita";
	}

}
