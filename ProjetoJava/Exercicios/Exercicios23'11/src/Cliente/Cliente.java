package Cliente;

public class Cliente {
	private String nomeCliente;
	private String cpfCliente;
	private int registroCliente;
	private int idade;
	
	
	public Cliente (String nome, String cpf, int registro, int idade1) {
		
		nomeCliente = nome;
		cpfCliente = cpf;
		registroCliente = registro;
		idade = idade1;
		
	}
	
	public String getDados() {
		String Dados = nomeCliente + " " + cpfCliente + " " + registroCliente + " " + idade;
		return Dados;
	}
	
}
