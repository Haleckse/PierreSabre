package personnages;


public class Ronin extends Humain {
	int honneur = 1; 
	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom, argent, boissonFavorite);
	}

	public void donner(Commercant commercantBeneficiaire) {
		int don = (int)(getArgent()*0.1); 
		parler(commercantBeneficiaire.getNom() + " prend ces " + don + " sous."); 
		perdreArgent(don);
		commercantBeneficiaire.parler(don + " sous!, je te remerci généreux donateur!"); 
	}

}
