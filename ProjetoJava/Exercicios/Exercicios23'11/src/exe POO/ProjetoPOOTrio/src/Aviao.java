
public class Aviao {

	private String modelo;
	
	private String tipo;
	
	private String companhia; 
	
	private int qtdPassageiros; 
	
	private boolean vooInter;
	
	private boolean ativo;
	
	public Aviao (String modelo1, String tipo1, String companhia1, int qtdPassageiros1, boolean vooInter1, boolean ativo1) {
		modelo = modelo1;
		tipo = tipo1;
		companhia = companhia1;
		qtdPassageiros = qtdPassageiros1;
		vooInter = vooInter1;
		ativo = ativo1;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public boolean isVooInter() {
		return vooInter;
	}

	public void setVooInter(boolean vooInter) {
		this.vooInter = vooInter;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;		
	}
	
}
