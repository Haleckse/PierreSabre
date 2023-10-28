package personnages;


public class Ronin extends Humain {
	int honneur = 1; 
	int force = honneur * 2; 
	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom, argent, boissonFavorite);
	}

	public void donner(Commercant commercantBeneficiaire) {
		int don = (int)(getArgent()*0.1); 
		parler(commercantBeneficiaire.getNom() + " prend ces " + don + " sous."); 
		perdreArgent(don);
		commercantBeneficiaire.parler(don + " sous!, je te remerci généreux donateur!"); 
	}
	
	public void provoquer(Yakuza yakuza) {
		if (force >= yakuza.getReputation()) {
			parler("Je t'ai eu petit yakuza!"); 
			yakuza.perdre(); 
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup"); 
			yakuza.gagnerArgent(argent);
			yakuza.gagner(argent);
		}
	}

}	
