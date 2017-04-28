package model;

public class Crianca extends Pessoa{

	
	
	
	public Crianca(int id, String nome, String data, String cartao, String observacoes) {
		super(id, nome, data, cartao);
		this.observacoes = observacoes;
	}

	private String observacoes;

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	
	
	
}
