import java.util.Scanner;

public class Eintrittspreise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die aktuelle Uhrzeit ein:");
		int Zeit = s.nextInt();
		int Preis=0;
		s.close();
		
		switch(Zeit) {
		case(21): Preis=8;
		break;
		case(22): Preis=10;
		break;
		case(23): Preis= 12;
		break;
		case(24): Preis= 13;
		break;
		default: System.out.println("Kein Service zur angegebenen Uhrzeit");
		}
		
		System.out.println("Preis: "+Preis+" €");
	}

}
