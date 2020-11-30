import java.util.Random;
import java.util.Scanner;

public class BiertTrinken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Promille = 0;
		Random z = new Random();
		Scanner s = new Scanner(System.in);
	
		while(Promille<=0.8) {
			System.out.println("Raten Sie eine Zahl zwischen 1 und 3");
			int Zahl = s.nextInt();
			int Zufall = 1+z.nextInt(3);
			if(Zahl==Zufall) {
				Promille-=0.02;
				System.out.println("richtig");
			}else {
				Promille+=0.05;
				System.out.println("falsch");
			}
			System.out.println("Neuer Promillewert: "+Promille);
		}
		s.close();
		
	}

}
