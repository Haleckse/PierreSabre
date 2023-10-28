package histoire;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Commercant;
import personnages.Ronin; 

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
		
		System.out.println("\n");
		System.out.println("L'histoire du yakuza.\n");
		
		Yakuza YakuLeNoir = new Yakuza("Yaku le noir", 30, "whisky", "Warsong"); 
		Commercant MarcoVictime = new Commercant("Marco la victime", 15); 
		YakuLeNoir.direBonjour();
		YakuLeNoir.parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par la?");
		YakuLeNoir.parler(MarcoVictime.getNom() + ", si tu tiens a ta vie donne moi ta bourse! ");
		YakuLeNoir.extorquer(MarcoVictime);
		MarcoVictime.seFaireExtorquer(); 
		
		System.out.println("\n");
		System.out.println("L'histoire du Ronin.\n");
		
		Ronin Roro = new Ronin("Roro", 60, "Shoshu"); 
		Roro.donner(MarcoVictime);
		
		System.out.println("\n");
		System.out.println("L'histoire du Yakuza qui gagne contre le Ronin.\n");
		
		Roro.parler("Je t'ai retrouvé vermine, tu vas payer!");
		Roro.provoquer(YakuLeNoir);
		
		System.out.println("\n");
	
		
		
				
	}
	

}
