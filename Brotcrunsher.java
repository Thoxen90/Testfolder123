import java.util.Scanner;

public class Brotcrunsher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		int Alter[] = new int[3];
		String[] Name = new String[3];
		String[] Vorname = new String[3];
		String Start;
		int sum=0, avg = 0;
		
		System.out.println("Guten Tag dies ist Ihr Assistent zum anlegen von neuen Benutzern");
		System.out.println("Bitte legen Sie 3 Neue Benutzer an");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Type Start to begin");
		Start = s.next();
		System.out.println("");
		
		for(int x=0;x<=2;x++) {
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
		
			System.out.println(Vorname[x]+" "+Name[x]+" "+Alter[x]);
			System.out.println("Eingabe erfolgreich");
			System.out.println("");
			
			sum = sum+Alter[x];
		}
		
		System.out.println("Zusammenfassung Benuter:");
		System.out.println("-------------------------------------------------------------------");
		
		for(int z=0; z<=2; z++) {
			String erw;
			if(Alter[z]>=18) {
				erw = "-volljährig-";
				}else {
				erw = "-minderjährig-";
			}
			System.out.println(Vorname[z]+" "+Name[z]+ " "+Alter[z]+" "+erw);
		}
		
		avg = sum / 3;
		
		System.out.println("");
		System.out.println("Durchschnittsalter: "+avg);
		System.out.println("-------------------------------------------------------------------");
		}
}


