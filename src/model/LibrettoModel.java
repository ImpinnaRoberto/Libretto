package model;

import java.awt.List;
import java.util.ArrayList;

public class LibrettoModel {

	private ArrayList<Esame> esami;
	
	public LibrettoModel(){
		this.esami=new ArrayList<Esame>();
	}

	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}else
			return false;
	}
	
	//Ricerca esame nella lista. Con indexOf ti restituisce il primo elemento che corrisponde all'oggetto tra paretesi. 
	//usa l'equals e dato che noi lo abbiamo riscritto con il codice, usa l'equls con il codice
	public Esame trovaEsame(String codice){
		int pos=this.esami.indexOf(new Esame(codice, null, null));
		if(pos==-1)
			return null;
		else
			return esami.get(pos);
	}
}
