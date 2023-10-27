package personnages;

public class Yakuza extends Humain{
	private String reputation; 
	private String clan; 
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom, argent, boissonFavorite);
		this.reputation = reputation; 
	}
	
	public void extorquer(Commercant commercantVictime) {
		argent = commercantVictime.getArgent(); 
		reputation = reputation + 1;
		parler("Jai piqué les " + commercantVictime.getArgent() + " sous de " + commercantVictime.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche!");
		
	}

	

}
