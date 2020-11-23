
public class Entrada3 {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Samsung", "Celular", "telefone, mensagem, whatsapp, etc.", 1570);
		
		System.out.println(produto1.getMarca());
		System.out.println(produto1.getTipo());
		System.out.println(produto1.getFuncao());
		System.out.println(produto1.getPreco());
	}
}
