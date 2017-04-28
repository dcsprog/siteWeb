package model;

public class Encarregado extends Pessoa{
	
	
	
	public Encarregado(int id, String nome, String data, String cartao, String contactoP, String contactoS) {
		super(id, nome, data, cartao);
		this.contactoP = contactoP;
		this.contactoS = contactoS;
	}
	
	private String contactoP;
	private String contactoS;
	
	public String getContactoP() {
		return contactoP;
	}
	public void setContactoP(String contactoP) {
		this.contactoP = contactoP;
	}
	public String getContactoS() {
		return contactoS;
	}
	public void setContactoS(String contactoS) {
		this.contactoS = contactoS;
	}
	
	

}
