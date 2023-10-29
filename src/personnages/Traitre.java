package personnages;
import java.util.Random;

public class Traitre extends Samurai {

	private int niveauDeTraitrise = 0; 
	
	public Traitre(String nom, int argent, String boissonFavorite, String seigneur) {
		super(nom, argent, boissonFavorite, seigneur);
	}
	
	@Override 
	public void direBonjour() {
		super.direBonjour(); 
		parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauDeTraitrise + " chut!"); 
	}
	
	public void ranconner(Commercant victime) {
		if (niveauDeTraitrise < 3) {
			int argentRanconner = (int)(victime.getArgent())*2/10;
			gagnerArgent(argentRanconner);
			victime.perdreArgent(argentRanconner);
			niveauDeTraitrise ++; 
			
			parler("Si tu veux ma protection contre les yakuzas donne moi " + argentRanconner + " sous ou gare a toi!"); 
			victime.parler("Tous de suite grand " + getNom());
				
			
		}
		else {
			parler("Mince je ne peux plus ranconner personne sinon un Samurai va me demasquer"); 
		}
	}
	
	public void faireLeGentil() {
		if (nombreConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car ne connais personne, sniff sniff"); 
		}
		else {
			Random random = new Random(); 
			int nb; 
			nb = random.nextInt(nombreConnaissance+1);
			int don = (int)(argent*(1/20)); 
			Humain fauxAmi = connaissance[nb]; 
			parler("Il faut que je remonte ma cote de confiance. Je vais faire ami ami avec " + fauxAmi.getNom()); 
			parler("Bonjour l'ami, je voudrais vous aider en vous donnant" + don + " sous"); 
			fauxAmi.gagnerArgent(don); 
			perdreArgent(don); 
			fauxAmi.parler("Merci " + getNom() + " vous etes quelqun de bien! "); 
		}
		if (niveauDeTraitrise > 0) {
			niveauDeTraitrise -= 1; 
		}
	}

}
