package model;

public class Pessoa {
	
	public Pessoa(int id, String nome, String data, String cartao) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.cartao = cartao;
	}
	
	
	private int id;
	private String nome;
	private String data;
	private String cartao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	
	
}
