package POO;
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		List <String> produtos = new ArrayList();
		produtos.add("Bolacha Salgada");
		produtos.add("Queijo");
		produtos.add("Vinho");
		produtos.add("Chocolate");
		System.out.println("Itens para comprar: " + produtos);
		produtos.remove("Chocolate");
		System.out.println("\nItens comprados que estavam disponíveis: " + produtos);
		produtos.set(2, "Vinho Branco");
		System.out.println("\nAtualização devido a troca de produto: " + produtos);
		for (String lista : produtos) {
			
			System.out.println("\nLista completa: " + produtos.indexOf(lista) + "|" + lista);
			
		}
	}
}
