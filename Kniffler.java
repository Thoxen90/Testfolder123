package KnifflerAufgabe;

import java.util.Scanner;

public class Kniffler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int Menge = 0;
		double Preis = 2.50, sum = 0;
		String Kategorie = "", Griff = "";
		
		System.out.println("Bitte geben Sie die gew�nschte Bestellmenge ein:");
		Menge = s.nextInt();
		
		System.out.println("Bitte geben Sie die gew�nschte Kategorie an (weich/mittel/hart)");
		Kategorie = s.next();
		
		System.out.println("Bitte geben Sie die gew�nschte Griffart an (gro�/normal/kinder)");
		Griff = s.next();
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Zusammenfassung Ihrer Bestellung:");
		System.out.println("Menge: "+Menge+" Griff: "+Griff+" Kategorie: "+Kategorie);
		System.out.println("");
		
		s.close();
		
		sum = Menge * Preis;
		
		System.out.println("Brutto Preis: "+sum+"�");
		
		if(Menge >=500 && Menge <20000) {
			System.out.println("Mengenrabatt 5%: "+(sum/100*5)+"�");
			sum = sum /100*95; 
		}
		if(Menge >= 20000) {
			System.out.println("Mengenrabatt 10%: "+(sum/100*10)+"�");
			sum = sum /100*90;
		}
		
		if(Griff.equals("kinder")) {
			switch (Kategorie) {
			case "weich": System.out.println("Rabatt f�r Kinder+weich 5%: "+(sum/100*5)+"�"); sum = sum/100*95; 
			break;
			case "mittel": System.out.println("Rabatt f�r Kinder+mittel 2%: "+(sum/100*2)+"�"); sum = sum/100*98; 
			break;
			case "hart": System.out.println("Rabatt f�r Kinder+hart 2%: "+(sum/100*2)+"�"); sum = sum/100*98; 
			break;
			}
		}
		
		if(Griff.equals("normal")) {
			switch (Kategorie) {
			case "weiche": System.out.println("Rabatt f�r normal+weich 1%: "+(sum/100*1)); sum = sum/100*99; 
			break;
			case "hart": System.out.println("Aufpreis f�r normal+hart 2,5%: "+(sum/100*2.5)); sum = sum/100*102.5; 
			break;
			}
		}
		
		if(Griff.equals("gro�")) {
			switch (Kategorie) {
			case "weich": System.out.println("Rabatt f�r gro�+weich 1%: "+(sum/100*1)); sum = sum/100*99; 
			break;
			case "hart": System.out.println("Aufpreis f�r gro�+hart 5%: "+(sum/100*5)); sum = sum/100*105; 
			break;
			}
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Preis nach Berechnung aller Rabatte: "+sum+"�");
		
	}

}
