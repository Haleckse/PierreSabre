package personnages;

public class Samurai extends Ronin {
	private String seigneur; 
	
	public Samurai(String nom, int argent, String boissonFavorite, String seigneur) {
		super(nom, argent, boissonFavorite);
		this.seigneur = seigneur; 
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur); 
	}
	
	
	public void boire(String boisson) {
		parler("Que vais-je choisir comme boisson? tiens je vais prendre un " + boisson); 
	}
		
	
}
