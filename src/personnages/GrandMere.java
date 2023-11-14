package personnages;

import java.util.Random;

public class GrandMere extends Humain {

	public GrandMere(String nom, int argent, String boissonFavorite) {
		super(nom, argent, boissonFavorite);
		// TODO Auto-generated constructor stub
	}
	
	private enum TypeHumain{
		commercant, 
		grandMere, 
		ronin,
		samurai, 
		traitre, 
		yakuza, 
		
	}
	
	private TypeHumain[] types = TypeHumain.values(); 
	
	
	@Override
	public void faireConnaissanceAvec(Humain autreHumain) {
		if (nombreConnaissance < 5) {
			connaissance[nombreConnaissance] = autreHumain; 
			nombreConnaissance = nombreConnaissance + 1;
			if(nombreConnaissance >= 5) System.out.println("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
		else {
			System.out.println("Oh ma tête ! Je ne peux plus retenir le nom dune personne supplémentaire !");
		}
	}
	
	public int humainHasard() {
		int min = 1;
		int max = nombreConnaissance;

			Random random = new Random();

			int value = random.nextInt(max + min) + min;
			
			return value;
	}
	
	public void ragoter() {
		for(int i = 0; i<nombreConnaissance; i++) {
			parler("Je crois que " + connaissance[i].getNom() + " est un " + types[humainHasard()]);
		}
		
	
	
}
	
}
			
		
	
	
