package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "the");
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int temp = getArgent(); 
		argent = 0; 
		parler("J ai tout perdu, le monde est trop injuste!"); 
		return temp;
	}
	
	public void recevoirDeLargent(int argentRecu) {
		argent = argent + argentRecu; 
		parler(argentRecu + "sous! Je te remercie généreux donateur!"); 
	}

}
