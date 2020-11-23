
public class Produto {

	private String marca;
	
	private String tipo;
	
	private String funcao; 
	
	private int preco; 
	
	public Produto (String marca1, String tipo1, String funcao1, int preco1) {
		marca = marca1;
		tipo = tipo1;
		funcao = funcao1;
		preco = preco1;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}


}
