import java.util.Scanner;
public class Quadrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie an wie gro� das Quadrat sein soll: ");
		int Eingabe = s.nextInt();
		
		for(int H�he= 1;H�he<=Eingabe;H�he++) {
			if(H�he==1||H�he==Eingabe) {
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
