package model;

public class AppM {

	public AppM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		LibrettoModel m= new LibrettoModel();
		
		System.out.println(m.addEsame(new Esame("03FYZ", "Tecniche  di programmazione", "Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("01QZP", "Ambient Intelligence", "Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("03FYZ", "Tecniche  di programmazione", "Fulvio Corno")));

		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("01QZP"));
		System.out.println(m.trovaEsame("99QQQ"));

		
	}

}
