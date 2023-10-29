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
		
		marco.direBonjour();
		roro.direBonjour();
		marco.faireConnaissanceAvec(roro);
		roro.faireConnaissanceAvec(marco);
		marco.direBonjour();
		yaku.direBonjour();
		marco.faireConnaissanceAvec(yaku);
		yaku.faireConnaissanceAvec(marco);
		marco.direBonjour();
		chonin.direBonjour();
		marco.faireConnaissanceAvec(chonin);
		chonin.faireConnaissanceAvec(marco);
		marco.direBonjour();
		kumi.direBonjour();
		marco.parler(marco.nombreConnaissance + ""); 
		marco.faireConnaissanceAvec(kumi); 
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
	}
}
