import java.util.Scanner;
public class Primzahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long Eingabe = s.nextLong();
		s.close();
		boolean Prim = true;
		
		for(long Teiler = 2;Teiler<Eingabe;Teiler++) {
			if(Eingabe%Teiler==0) {
				Prim = false;
				Teiler = Teiler+Eingabe;
		}
		}
		System.out.println("Ganze Zahl eingegeben: "+Eingabe);
		if(Prim == false) {
			System.out.println(Eingabe+" ist KEINE Primzahl");
		}else {
			System.out.println(Eingabe+" ist eine PRIMZAHL");
		}
		
	}

}
