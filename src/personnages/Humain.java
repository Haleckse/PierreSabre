package personnages;


public class Humain {
	private String nom; 
	protected int argent; 
	private String boissonFavorite; 
	private int nombreConnaissanceMax = 30;
	private Humain [] connaissance = new Humain[nombreConnaissanceMax]; 
	public int nombreConnaissance = 0; 
	
	public Humain(String nom, int argent, String boissonFavorite) {
		this.nom = nom; 
		this.argent = argent; 
		this.boissonFavorite = boissonFavorite; 
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ")- " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite); 
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " GLOUPS !!"); 
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;  
	}
	
	public void perdreArgent(int perte) {
		argent = argent - perte; 
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir une " + bien + " a " + prix + " sous.");
			perdreArgent(prix); 
		}
		else { 
			parler("Je n ai plus que " + getArgent() + " sous en poche. Je ne peux meme pas m'offrir un " + bien + " a " + prix + " sous."); 
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		
		if(nombreConnaissance < nombreConnaissanceMax) {
			connaissance[nombreConnaissance] = autreHumain; 
			nombreConnaissance = nombreConnaissance + 1;
		}
		else {
			for (int i = 1; i < nombreConnaissance; i++) {
				connaissance[i-1] = connaissance[i]; 
			}
			connaissance[nombreConnaissance-1] = autreHumain;
		}
	}
	
	public void listerConnaissance() {
		System.out.print("(" + getNom() + ")- " + "Je connais beaucoup de monde dont : ");
		for (int i = 0; i<nombreConnaissance; i++) {
			System.out.print(connaissance[i].getNom()+ ", ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
