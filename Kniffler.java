import java.util.Scanner;

public class Kniffler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int Menge = 0;
		double Preis = 2.50, sum = 0;
		String Kategorie = "", Griff = "", Grifftext ="", Kategorietext="";
		
		System.out.println("");
		System.out.println("Bitte geben Sie die gewünschte Bestellmenge ein:");
		Menge = s.nextInt();
		
		System.out.println("Bitte geben Sie die gewünschte Kategorie an (weich/mittel/hart)");
		Kategorie = s.next();
		
		System.out.println("Bitte geben Sie die gewünschte Griffart an (groß/normal/kinder)");
		Griff = s.next();
		
		switch (Griff) {
			case "Kinder": Grifftext = "Kinder";
			break;
			case "kinder": Grifftext = "Kinder";
			break;
			case "k": Grifftext = "Kinder";
			break;
			case "normal": Grifftext = "Normal";
			break;
			case "Normal": Grifftext = "Normal";
			break;
			case "n": Grifftext = "Normal";
			break;
			case "groß": Grifftext = "Groß";
			break;
			case "Groß": Grifftext = "Groß";
			break;
			case "g": Grifftext = "Groß";
			break;
		}
		switch(Kategorie) {
			case "weich": Kategorietext="weich";
			break;
			case "Weich": Kategorietext="weich";
			break;
			case "w": Kategorietext="weich";
			break;
			case "mittel": Kategorietext="mittel";
			break;
			case "Mittel": Kategorietext="mittel";
			break;
			case "m": Kategorietext="mittel";
			break;
			case "hart": Kategorietext = "hart";
			break;
			case "Hart": Kategorietext = "hart";
			break;
			case "h": Kategorietext = "hart";
			break;
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Zusammenfassung Ihrer Bestellung:");
		System.out.println("");
		System.out.println("Menge: "+Menge+" | Griff: "+Grifftext+" | Kategorie: "+Kategorietext);
		System.out.println("");
		
		s.close();
		
		sum = Menge * Preis;
		
		System.out.println("Brutto Preis: 					"+sum+"€");
		
		if(Menge >=500 && Menge <20000) {
			System.out.println("Mengenrabatt 5%: 				"+(sum/100*5*-1)+"€");
			sum = sum /100*95; 
		}else
		if(Menge >= 20000) {
			System.out.println("Mengenrabatt 10%: 				"+(sum/100*10*-1)+"€");
			sum = sum /100*90;
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Zwischensumme nach Abzug von Mengenrabatt: 	"+sum+"€");
		
		if(Griff.equals("kinder")||Griff.equals("Kinder")||Griff.equals("k")) {
			switch (Kategorietext) {
			case "weich": System.out.println("Rabatt für Kinder+weich 5%: 			"+(sum/100*5*-1)+"€"); sum = sum/100*95; 
			break;
			case "mittel": System.out.println("Rabatt für Kinder+mittel 2%: 			"+(sum/100*2*-1)+"€"); sum = sum/100*98; 
			break;
			case "hart": System.out.println("Rabatt für Kinder+hart 2%: 			"+(sum/100*2*-1)+"€"); sum = sum/100*98; 
			break;
			}
		}
		else
		if(Griff.equals("normal")||Griff.equals("Normal")||Griff.equals("n")) {
			switch (Kategorietext) {
			case "weich": System.out.println("Rabatt für normal+weich 1%: 			"+(sum/100*1*-1)+"€"); sum = sum/100*99; 
			break;
			case "hart": System.out.println("Aufpreis für normal+hart 2,5%: 			 "+(sum/100*2.5)+"€"); sum = sum/100*102.5; 
			break;
			}
		}
		else
		if(Griff.equals("groß")||Griff.equals("Groß")||Griff.equals("g")) {
			switch (Kategorietext) {
			case "weich": System.out.println("Rabatt für groß+weich 1%: 			"+(sum/100*1*-1)+"€"); sum = sum/100*99; 
			break;
			case "hart": System.out.println("Aufpreis für groß+hart 5%: 			 "+(sum/100*5)+"€"); sum = sum/100*105; 
			break;
			}
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Preis nach Berechnung aller Rabatte: 		"+sum+"€");
		
	}

}
