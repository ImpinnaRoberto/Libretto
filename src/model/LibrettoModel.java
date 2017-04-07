package model;

import java.awt.List;
import java.util.ArrayList;

import it.polito.tdp.libretto.db.EsameDAO;

public class LibrettoModel {

	private ArrayList<Esame> esami;
	
	public LibrettoModel(){
		this.esami=new ArrayList<Esame>();
	}

	public boolean addEsame(Esame e){
		EsameDAO dao= new EsameDAO();
		return dao.create(e);
	}
	
	//Ricerca esame nella lista. Con indexOf ti restituisce il primo elemento che corrisponde all'oggetto tra paretesi. 
	//usa l'equals e dato che noi lo abbiamo riscritto con il codice, usa l'equls con il codice
	public Esame trovaEsame(String codice){
		EsameDAO dao= new EsameDAO();
		Esame e=dao.find(codice);
		return e;
	}
}
