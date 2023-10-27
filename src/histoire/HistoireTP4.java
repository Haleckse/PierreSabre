package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		System.out.println("L'histoire du Prof.\n");
		Humain Prof = new Humain("Prof", 50, "Kombucha");
		Prof.direBonjour();
		Prof.acheter("boisson", 12); 
		Prof.boire();
		Prof.acheter("jeu", 2);
		Prof.acheter("kimono", 50); 
		
		System.out.println("\n");
		System.out.println("L'histoire du commercant.\n");
		
		Commercant Marco = new Commercant("marco", 100); 
		Marco.direBonjour();
		Marco.seFaireExtorquer(); 
		Marco.recevoirDeLargent(15);
		Marco.boire(); 
	}

}
