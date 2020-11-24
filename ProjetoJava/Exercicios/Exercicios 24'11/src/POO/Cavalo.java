package POO;

public class Cavalo extends Animal {

	public Cavalo(String nome, String idade) {

		super(nome, idade);

	}

	@Override

	public String acaoFeita() {

		return "Correr";
	}

	@Override
	public String somEmitido() {
		
		return "Relinchado";
	}

}
