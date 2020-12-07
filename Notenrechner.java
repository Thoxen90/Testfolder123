import java.util.Scanner;

public class Notenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte geben sie die Anzahl der Punkte an:");
		
		int x = s.nextInt();
		s.close();
		String Note="";
		
		if(x>=0 && x<=19) {
		Note = "ungenügend";
		}else if(x>19 && x <=39) {
			Note = "mangelhaft";
		}else if(x>39 && x<=54) {
			Note = "ausreichend";
		}else if(x>54 && x<= 69) {
			Note = "befriedigend";
		}else if(x>69 && x<=84) {
			Note = "gut";
		}else if(x>84) {
			Note = "sehr gut";
		}else {System.out.println("ungültige Eingabe");}
		System.out.println(Note);
	
	}
}
