package personnages;

public class Yakuza extends Humain{
	private int reputation = 4; 
	private String clan; 
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom, argent, boissonFavorite);
		this.clan = clan; 
	}
	
	public void extorquer(Commercant commercantVictime) {
		argent = commercantVictime.getArgent(); 
		reputation = reputation + 1;
		parler("Jai piqué les " + commercantVictime.getArgent() + " sous de " + commercantVictime.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche!");
		
	}

	public int getReputation(){
		return reputation; 
	}

	public void perdre() {
		parler("J’ai perdu mon duel et mes " + argent + " sous, sniff... J'ai deshonoré le clan " + clan); 
		perdreArgent(argent);
		reputation = reputation-1;
	}
	public void gagner(int gains){
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan " + clan + " ? Jel'ai dépouillé de ses " + gains + "sous!"); 
	}
}
