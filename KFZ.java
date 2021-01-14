
public class KFZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KFZ BMW = new KFZ();
		BMW.setMarke("BMW");
		BMW.setName("3er");
		BMW.setSitze(5);
		BMW.setPersonen(3);
		BMW.setTank(70);
		BMW.setFüllstand(40);
		BMW.setMaxSpeed(230);
		BMW.setAktSpeed(125);
		BMW.ausgabe();
		BMW.tanken();
		BMW.einsteigen();
		BMW.aussteigen();
		BMW.beschleunigen();
		BMW.bremsen();
		BMW.parken();
		BMW.losfahren();
		
				
		KFZ Audi = new KFZ();
		Audi.setMarke("Audi");
		Audi.setName("A4");
		Audi.setSitze(5);
		Audi.setPersonen(4);
		Audi.setTank(60);
		Audi.setFüllstand(30);
		Audi.setMaxSpeed(210);
		Audi.setAktSpeed(150);
		Audi.ausgabe();
		Audi.tanken();
		Audi.einsteigen();
		Audi.einsteigen();
		Audi.aussteigen();
		Audi.beschleunigen();
		Audi.beschleunigen();
		Audi.beschleunigen();
		Audi.bremsen();
		Audi.parken();
		Audi.losfahren();
		
		
	}

	String Name,Marke;
	int Sitze,Tank,MaxSpeed,Füllstand,Personen,AktSpeed;
	
	public String getMarke() {
		return Marke;
	}
	
	public void setMarke(String Marke) {
		this.Marke=Marke;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public int getSitze() {
		return Sitze;
	}
	
	public void setSitze(int Sitze) {
		if(Sitze<1) {
			System.out.println("Fehler! Ein Auto hat mindesten 1 Sitz");
			this.Sitze = 1;
		}else if(Sitze>8) {
			System.out.println("Fehler! Ein Auto hat nicht mehr als 8 Sitze");
			this.Sitze = 8;
		}else {
		this.Sitze=Sitze;
		}
	}
	
	public int getTank() {
		return Tank;
	}
	
	public void setTank(int Tank) {
		if(Tank>500) {
			System.out.println("Fehler! Ein Autotank fasst nicht mehr als 500Liter");
			this.Tank=500;
		}else if(Tank<10) {
			System.out.println("Fehler! Ein Autotank fasst mindestens 10Liter");
			this.Tank=10;
		}else {
		this.Tank = Tank;
		}
	}
	
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	
	public void setMaxSpeed(int MaxSpeed) {
		if(MaxSpeed>1000) {
			System.out.println("Fehler! Ein Auto durchbricht nicht die Schallgrenze");
			this.MaxSpeed=1000;
		}else if(MaxSpeed<0) {
			System.out.println("Fehler! Ein Auto fährt nicht langsamer als 0 km/h");
			this.MaxSpeed = 0;
		}else {
		this.MaxSpeed=MaxSpeed;
		}
	}
	
	public int getFüllstand() {
		return Füllstand;
	}
	
	public int getPersonen() {
		return Personen;
	}
	
	public void setPersonen(int Personen) {
		if(getPersonen()>getSitze()) {
			System.out.println("Fehler! So viele Leute passen nicht ins Auto");
			this.Personen = Sitze;
		}else if(getPersonen()<0) {
			System.out.println("Fehler! es gibt keine Minusmenschen");
		}else {
		this.Personen = Personen;
		}
	}
	
	public void setFüllstand(int Füllstand) {
		if(getFüllstand()>getTank()) {
			System.out.println("Fehler! Füllstand übersteigt Tankgröße");
			this.Füllstand=Tank;
		}else if(getFüllstand()<0) {
			System.out.println("Fehler! Füllstand liegt unter 0");
			this.Füllstand=0;
		}else {
		this.Füllstand = Füllstand;
		}
	}
	
	public void tanken() {
		this.Füllstand=Tank;
		System.out.println("Voll getankt! Neuer Füllstand: "+this.Tank+" Liter");
		System.out.println();
	}
	
	public void einsteigen() {
		if(getPersonen()>=getSitze()) {
			System.out.println("Fehler! Es passen nicht mehr Leute ins Auto");
		}else {
		this.Personen = Personen +1;
			System.out.println("Es ist eine Person eingestiegen! Neue Personenzahl: "+this.Personen);
		}
	}
	
	public void aussteigen() {
		if(getPersonen()<=0) {
			System.out.println("Fehler! Es sind schon alle ausgestiegen");
		}else {
		this.Personen = Personen -1;
			System.out.println("Es ist eine Persone ausgestiegen! Neue Personenzahl: "+this.Personen);
		}
	}
	
	public int getAktSpeed() {
		return AktSpeed;
	}
	
	public void setAktSpeed(int AktSpeed) {
		this.AktSpeed = AktSpeed;
	}
	
	public void beschleunigen() {
		if(AktSpeed+10<=MaxSpeed) {
		this.AktSpeed = AktSpeed+10;
		System.out.println("Beschleunige! Neue Geschwindigkeit: "+this.AktSpeed+" km/h");
		}else {
			System.out.println("Fehler! Geschwindigkeit übersteigt Maximal Geschwindigkeit");
		}
	}
	
	public void bremsen() {
		if(AktSpeed-10>0) {
		this.AktSpeed = AktSpeed-10;
		}else {
		this.AktSpeed = 0;	
		}
		System.out.println("Bremse! Neue Geschwindigkeit: "+this.AktSpeed+" km/h");	
	}
	
	public void parken() {
		System.out.println();
		System.out.println("------Parkvorgang eingeleitet!------");
		while(this.AktSpeed>0) {
			bremsen();
			if(this.AktSpeed<0) {
				this.AktSpeed = 0;
			}
			if(getAktSpeed()==0) {
				System.out.println("------Auto erfolgreich geparkt!-------");
				System.out.println();
			}
		}
	}
	
	public void losfahren() {
		if(AktSpeed>0) {
			System.out.println("Auto fährt schon");
		}else {
			System.out.println("Fahre los!");
		this.AktSpeed = AktSpeed +1;
			System.out.println("Neue Geschwindigkeit: "+this.AktSpeed+" km/h");
		}
	}
	
	public void ausgabe() {
		System.out.println();
		System.out.println("	 ---------------------------------------------------------------");
		System.out.println("	|	Marke: "+this.Marke+" Variante: "+this.Name+" Sitze: "+this.Sitze+" Personen: "+this.Personen+" 		|");
		System.out.println("	|	MaxGeschwindigkeit: "+this.MaxSpeed+" AktGeschwindigkeit "+this.AktSpeed+" 		|");
		System.out.println(" 	|	Tankgröße: "+this.Tank+" Liter  Aktueller Füllstand: "+this.Füllstand+" Liter	|");
		System.out.println("	 ---------------------------------------------------------------");
		System.out.println();
	}
}
