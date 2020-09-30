// Aufgabenstellung:-Lege mehrere Personen mit Vor-, Nachnamen und Altern an
//					-Bestimme ob die genannten Personen Volljährig sind oder nicht
//					-Füge eine Anrede (Herr oder Frau) hinzu
//					-Errechne den Altersdurchnitt der angelegten Personen
//					-Gebe alle Datensätze und den Altersdurchnitt aus
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Alter = new int[5];	//Initialisierung für ein Array für mehrere Alterswerte
		String[][] Name = new String [5][2]; //Initialisierung eines Arrays mit 2 Spalten für Vor- und Nachname
		boolean Erwachsen = false;
		int sum = 0 , average = 0;
		int AnzahlDaten = 5;
		String Anrede = "Herr";
		//Initialierung mehrerer Variablen
		
		Alter[0] = 15;
		Alter[1] = 18;
		Alter[3] = 20;
		Alter[4] = 12;
		Alter[2] = 38;
		//deklaration Alterswerte
		
		Name[0][0] = "Sarah";
		Name[0][1] = "Kerschgens";
		Name[1][0] = "Klaus";
		Name[1][1] = "Peters";
		Name[2][0] = "Peter";
		Name[2][1] = "Brößner";
		Name[3][0] = "Karl";
		Name[3][1] = "Kolnik";
		Name[4][0] = "Gertrud";
		Name[4][1] = "Rufnik";
		//deklaration Vor und Nachnamen
		
		for(int i=0;i<=4;i++) {
		//eine for schleife um die unterschiedlichen Zeilen in Name und Alter abzuarbeiten 
			
		switch (Name[i][0]) {
			case "Klaus": Anrede = "Herr";
			break;
			case "Peter": Anrede = "Herr";
			break;
			case "Sarah": Anrede = "Frau";
			break;
			case "Karl": Anrede = "Herr";
			break;
			case "Gertrud": Anrede = "Frau";
			break;
		}
		//eine Switch Case Abfrage um zu ermitteln ob Anrede Herr oder Frau
		
			System.out.println("Hallo mein Name ist "+Anrede+" "+Name[i][0]+" "+Name[i][1]);
			System.out.println("Ich bin "+Alter[i]+" Jahre alt");
		//Ausgabe der Aktuellen Anrede, Vor-, Nachname und Alter
			
		if(Alter[i]<18) {
			Erwachsen = false;
			}else {
			Erwachsen = true;
		}
		//if Abfrage um zu ermitteln ob die entsprechende Person volljährig ist oder nicht
		
		if(Erwachsen==true) {
			System.out.println("Also bin ich erwachsen");
			}else {
			System.out.println("Also bin ich noch minderjährig");
		}
		//Ausgabe Status Erwachsen oder nicht (eigentlich hätte ich dies auch in die obere if abfrage mit setzen können aber ich wollte der boolean irgendeinen Sinn geben)
		
		System.out.println();
		sum = sum+Alter[i];
		//erhöhe die Alterssumme um den aktuellen Alterswert
		
		}
		average = sum / AnzahlDaten;
		//ziehe einen Durchschnitt aus den gesammelten Alterswerten
		
		System.out.println();
		System.out.println("Das Durchschnittsalter liegt bei "+average+" Jahren");
		//Ausgabe Altersdurchschnitt
	}

}
