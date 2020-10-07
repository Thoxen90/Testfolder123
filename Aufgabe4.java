import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double Preis = 0.28;
		double Kilometer = 0;
		double Ergebnis = 0;
		double Preisab20 = 0.25;
		double Preisab50 = 0.20;
		
		System.out.println("Bitte geben Sie die gewünschte Stecke in Kilometern an:");
		Kilometer = s.nextDouble();
		
		if(Kilometer<20) {
		Ergebnis = (Preis*Kilometer);
		}
		if(Kilometer>=20 && Kilometer<50) {
			Ergebnis = (Preis*20+(Preisab20*(Kilometer-20)));
		}
		if(Kilometer>=50) {
			Ergebnis = (Preis*20+(Preisab20*))
		}
		System.out.println("");
		
		
		
	}

}
