/*	Aufgabenstellung: 	-schreibe ein Programm um eine beliebige Anzahl Berwerber anzulegen
 * 						-überprüfe in der Eingabe Vor- und Nachname sowie Alter und Schulabschluss
 * 						-Lass dein Programm überprüfen ob die angelegten Personen volljährig sind oder nicht
 * 						-stelle eine Eignung für den Job fest (Bedingung Bewerber volljährig und Schulabschluss Abitur oder besser)
 * 						-fasse alle angelegten Bewerber zusammen und errechne ein Durchschnittsalter
 *						-Liste alle geeigneten Bewerber auf 
 */


import java.util.Scanner;

public class Benutzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		//es wird eine Scanner Methode initialisiert um Benutzer Eingaben abzufragen
		
		int Anzahl_Datensaetze;
		
		System.out.println("Guten Tag dies ist Ihr Assistent zum anlegen von neuen Bewerbern");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Wie viele Bewerber sollen angelegt werden?");
		
		Anzahl_Datensaetze = s.nextInt();
		// die erste Zahleneingabe legt fest wie viele Benutzer das System anlegt
		
		System.out.println("");
		
		int Alter[] = new int[Anzahl_Datensaetze];
		String[] Nachname = new String[Anzahl_Datensaetze];
		String[] Vorname = new String[Anzahl_Datensaetze];
		int sum=0, avg = 0;
		String[] Schulabschluss = new String[Anzahl_Datensaetze];
		boolean Eignung = false;
		String Eig[] = new String[Anzahl_Datensaetze];
		//es werden mehrere Arrays und Variablen angelegt mit denen ich später arbeite
		
		for(int x=0;x<Anzahl_Datensaetze;x++) {
			// eine for schleife um die einzelnen Einträge durchzugehen
			
			System.out.println("Vorname für "+(x+1)+". Bewerber");
			Vorname[x] = s.next();
			// die nächste String Eingabe wird im Aktuellen Vornamen gespeichert
			
			System.out.println("");
			
			System.out.println("Nachname für "+(x+1)+". Bewerber");
			Nachname[x] = s.next();
			// selbe für Nachname
			
			System.out.println("");
			
			System.out.println("Alter für "+(x+1)+". Bewerber");
			Alter[x] = s.nextInt();
			// Zahlen eingabe für Alter
			
			s.nextLine();  //sinnfreier Input um einen absatz zwischen s.nextInt(); und s.nextLine() zu schaffen da sonst der s.nextline() Befehl einfach übersprungen wurde
			
			System.out.println("");
			System.out.println("Schulabschluss von "+(x+1)+". Bewerber");
			Schulabschluss[x] = s.nextLine();
			// String Eingabe Schulabschluss
			
			System.out.println("");
			System.out.println(Vorname[x]+" "+Nachname[x]); //Ausgabe der eingegebenen Werte und bestätigung der Eingabe
			System.out.println("Eingabe erfolgreich");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("");
			
			sum = sum+Alter[x]; //aktuelles alter wird zu summe addiert
		}
		s.close();
		
		System.out.println("Zusammenfassung Bewerber:");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(int z=0; z<Anzahl_Datensaetze; z++) {
			String erw;
			
			if(Alter[z]>=18) {
				erw = "-volljährig-";
				}else {
				erw = "-minderjährig-";
			}
			// eine if abfrage um zu ermitteln ob angelegte Benutzer volljährig ist oder nicht
			switch (Schulabschluss[z]) {
					case "MittlereReife": Eignung = false;
					break;
					case "FachhochschulReife": Eignung = true;
					break;
					case "Hauptschulabschluss": Eignung = false;
					break;
					case "Fachabitur": Eignung = true;
					break;
					case "FachgebundeneHochschulreife": Eignung = true;
					break;
					case "FachoberschulReife": Eignung = true;
					break;
					case "Abitur": Eignung = true;
					break;
					case "Studium": Eignung = true;
					break;
					case "Abi": Eignung = true;
					break;
					case "Student": Eignung = true;
					break;
					case "AllgemeineHochschulreife": Eignung = true;
					break;
					case "Mittlere-Reife": Eignung = false;
					break;
					case "Fachhochschul-Reife": Eignung = true;
					break;
					case "Hauptschul-Abschluss": Eignung = false;
					break;
					case "Fachgebundene-Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul-Reife": Eignung = true;
					break;
					case "Allgemeine-Hochschulreife": Eignung = true;
					break;
					case "Mittlere Reife": Eignung = false;
					break;
					case "Fachhochschul Reife": Eignung = true;
					break;
					case "Hauptschul Abschluss": Eignung = false;
					break;
					case "Fachgebundene Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul Reife": Eignung = true;
					break;
					case "Allgemeine Hochschulreife": Eignung = true;
					break;
					default: Eignung = false;
			}
			// eine switch case abfrage um zu ermitteln ober der Angegebene Schulabschluss für den Job geeignet ist oder nicht
			
			if(Eignung == true && erw == "-volljährig-") {
				Eig[z] = "Ist für den Job geeignet";
				} else {
				Eig[z] = "Ist nicht für den Job geeignet";
			}
			
			System.out.println(Vorname[z]+" "+Nachname[z]+ " "+Alter[z]+" "+erw+" |"+Schulabschluss[z]+"| "+Eig[z]);
		}
		
		avg = sum / Anzahl_Datensaetze;		// Durchschnittsalter Benutzer
		
		System.out.println("");
		System.out.println("Durchschnittsalter: "+avg);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("");
		System.out.println("Zusammenfassung geeigneter Bewerber");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(int q=0;q<Anzahl_Datensaetze;q++) {
			if(Eig[q]=="Ist für den Job geeignet") {
				System.out.println(Vorname[q]+" "+Nachname[q]);
			}
		}
		//alle geeignete Bewerber werden separat aufgelistet
		System.out.println("-----------------------------------------------------------------------------------------------");
		
	}
}
