package services;

import java.util.ArrayList;

import model.Encarregado;

public class SEEducacao {

	ArrayList<Encarregado> arEducacao;
	
	public SEEducacao(){
		arEducacao = new ArrayList<>();
	}

	
	public ArrayList nomePor(String comeco){
		ArrayList<Encarregado> arEd = new ArrayList<>();
		
		//for que pesquisa por encarregado de educacao cujo nome comeca por String comeco
		
		return arEd;
	}
	
	public ArrayList<Encarregado> getArEducacao() {
		return arEducacao;
	}

	public void setArEducacao(ArrayList<Encarregado> arEducacao) {
		this.arEducacao = arEducacao;
	}
	
}
