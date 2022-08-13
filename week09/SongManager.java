package week09;

public class SonsgManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1=new Song("Bohemian Rhapsody", "Queen", 
				"A Night at the Opera", "Freddie Mercury"," ",
				1975);
		Song s2=new Song("Persona", "BTS", "Map of the soul",
			"Hiss Noise", "피독",
				2019);
		
		s1.show();
		System.out.println("");
		s2.show();

	}

}
