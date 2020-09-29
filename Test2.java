
public class Test2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] alter = new int[5];
			String[] name = new String[5];
			
			alter[1] = 18;
			alter[0] = 14;
			alter[2] = 24;
			alter[3] = 35;
			alter[4] = 40;
			
			name[0] = "Peter";
			name[1] = "Klaus";
			name[2] = "Ralf";
			name[3] = "Karl";
			name[4] = "Frieda";
		// arrays für Namen und Alter werden erstellt
			
			int sum = 0, Average = 0;			
			boolean erwachsen = false;
		// Variablen für Alterssumme Altersdurchschnitt und erwachsen Status werden festgelegt
			for(int i =0;i<=4;i++) {
		// eine for Schleife welche die einzelnen Arrays durchgeht und diese überprüft
			if (alter[i]>=18) {
				erwachsen = true;
			}else {
				erwachsen = false;
			}
		// es wird ein alterscheck durchgeführt und festgelegt ob die Person erwachsen ist oder nicht
			System.out.println( "Hallo mein Name ist "+name[i]);
			System.out.println( "Ich bin " +alter[i]+ " Jahre alt");
			if(erwachsen==true) {
				System.out.println("ich bin erwachsen");
			}else {
				System.out.println("ich bin noch minderjährig");
			}
			//der Name das Alter der status erwachsen oder nicht werden ausgegeben
			System.out.println();
			sum = sum+alter[i];
			}
			Average = sum / 5;
			System.out.println("Durchschnittsalter liegt bei "+Average);
			// die einzelnen alterswerte werden zusammengerechnet und daraus wird ein Average gezogen
		}
	}
