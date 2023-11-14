package histoire;
import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		System.out.println("L'histoire du Yakuza, du ronin et du commercant");
		System.out.println("\n");
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
		
		marco.faireConnaissanceAvec(roro);
		roro.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(yaku);
		yaku.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(chonin);
		chonin.faireConnaissanceAvec(marco);
		marco.parler(marco.nombreConnaissance + ""); 
		marco.faireConnaissanceAvec(kumi); 
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		System.out.println("\n");
		
		Samurai akimoto = new Samurai("Akimoto", 80, "saké", "Miyamoto"); 
		akimoto.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(akimoto);
		akimoto.listerConnaissance();
		akimoto.boire("the");
		
		System.out.println("\n");
		
		Traitre masako = new Traitre("Masako", 100, "whisky", "Miyamoto"); 
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		akimoto.faireConnaissanceAvec(masako);
		masako.faireConnaissanceAvec(akimoto);
		
		masako.ranconner(kumi);
		
	
		masako.faireConnaissanceAvec(yaku);
		yaku.faireConnaissanceAvec(masako);
		
		masako.faireLeGentil();
		
		masako.direBonjour();
		roro.direBonjour();
		
		System.out.println("");
		
		Samurai akira = new Traitre("Akira", 50, "whisky", "Miyamoto");
		Ronin hiro = new Traitre("Hiro", 20,"saké", "Miyamoto");
		Humain nori = new Traitre("Nori", 20, "whisky", "Miyamoto");
		
//		Masako peut utiliser : direbonjour(), ranconner(), faireLeGentil(), ainsi que les methodes de la classe humain"
//		
		
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10,"the");
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
		
		
		
		
		
		
	}
}
