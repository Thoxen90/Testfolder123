import java.util.Scanner;
public class Quadrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie an wie groß das Quadrat sein soll: ");
		int Eingabe = s.nextInt();
		
		for(int Höhe= 1;Höhe<=Eingabe;Höhe++) {
			if(Höhe==1||Höhe==Eingabe) {
				for(int Breite = 1;Breite<=Eingabe;Breite++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for(int Breite=1;Breite<=Eingabe;Breite++) {
					if(Breite==1||Breite==Eingabe) {
						System.out.print("* ");						
					}else {
						System.out.print("  ");
					}
					if(Breite==Eingabe) {
						System.out.println();
					}
				}
			}
		}
		
		s.close();
		
	}

}
