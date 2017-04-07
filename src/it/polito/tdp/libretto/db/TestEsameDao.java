package it.polito.tdp.libretto.db;

import model.Esame;

public class TestEsameDao {



	public static void main(String[] args) {
		EsameDAO dao= new EsameDAO();
		
		Esame e1=dao.find("03FYZ");
		System.out.println(e1);
		
		Esame e2=dao.find("99QQQ");
		System.out.println(e2);
	}

}
