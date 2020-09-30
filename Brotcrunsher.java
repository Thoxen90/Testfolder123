import java.util.Scanner;

public class Brotcrunsher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Anzahl_Datensaetze;
		
		System.out.println("Guten Tag dies ist Ihr Assistent zum anlegen von neuen Benutzern");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Wie viele Benutzer sollen angelegt werden?");
		Anzahl_Datensaetze = s.nextInt();
		System.out.println("");
		
		int Alter[] = new int[Anzahl_Datensaetze];
		String[] Name = new String[Anzahl_Datensaetze];
		String[] Vorname = new String[Anzahl_Datensaetze];
		int sum=0, avg = 0;
		String[] Schulabschluss = new String[Anzahl_Datensaetze];
		boolean Eignung = false;
		
		for(int x=0;x<Anzahl_Datensaetze;x++) {
			int z = x+1;				
			System.out.println("Vorname für "+z+". Benutzer");
			Vorname[x] = s.next();
			System.out.println("");
			
			System.out.println("Nachname für "+z+". Benutzer");
			Name[x] = s.next();
			System.out.println("");
			
			System.out.println("Alter für "+z+". Benutzer");
			Alter[x] = s.nextInt();
			System.out.println("");
			
			System.out.println("Schulabschluss von "+z+". Benutzer");
			Schulabschluss[x] = s.next();
			System.out.println("");
			System.out.println(Vorname[x]+" "+Name[x]+" "+Alter[x]);
			System.out.println("Eingabe erfolgreich");
			System.out.println("");
			
			sum = sum+Alter[x];
		}		
		System.out.println("Zusammenfassung Benuter:");
		System.out.println("-------------------------------------------------------------------");
		
		for(int z=0; z<Anzahl_Datensaetze; z++) {
			String Eig = "Ist nicht geeignet";
			String erw;
			if(Alter[z]>=18) {
				erw = "-volljährig-";
				}else {
				erw = "-minderjährig-";
			}
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
					case "Abi": Eignung = true;
					break;
					case "Studium": Eignung = true;
					break;
					default: Eignung = false;					
			}
			if(Eignung == true && erw == "-volljährig-") {
				Eig = "Ist für den Job geeignet";
			} else {
				Eig = "Ist nicht für den Job geeignet";
			}
			System.out.println(Vorname[z]+" "+Name[z]+ " "+Alter[z]+" "+erw+" "+Schulabschluss[z]+" "+Eig);
		}
				avg = sum / Anzahl_Datensaetze;		
		System.out.println("");
		System.out.println("Durchschnittsalter: "+avg);
		System.out.println("-------------------------------------------------------------------");
		}
}


