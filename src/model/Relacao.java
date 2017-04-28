package model;

public class Relacao {

	
	
	public Relacao(String tipo, Crianca crianca, Encarregado ee) {
		super();
		this.tipo = tipo;
		this.crianca = crianca;
		this.ee = ee;
	}
	
	private String tipo;
	private Crianca crianca;
	private Encarregado ee;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Crianca getCrianca() {
		return crianca;
	}
	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	public Encarregado getEe() {
		return ee;
	}
	public void setEe(Encarregado ee) {
		this.ee = ee;
	}
	
	
	
}
