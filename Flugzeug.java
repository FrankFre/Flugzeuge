
public class Flugzeug {

	// Klassenvariablen
	float spannw;
	int sitze;
	float gschub;
	int motoren;

	

	public static void main(String[] args) {

		Segelflugzeug sf = new Segelflugzeug(17.0f);
		System.out.println("Segelflugzeug: Spannweite: " + sf.spannw + "m" + "  Sitze: " + sf.sitze);
		
		// ein Passagierflugzeug mit 10,97 Spannweite,
		// 4 Plaetzen und 1,3 kN Schub (Cessna 172 P)
		Passagierflugzeug pg = new Passagierflugzeug(10.97f, 4, 1.3f);
		System.out.println("Passagierflugzeug: Spannweite: " + pg.spannw + "  Sitze: " + pg.sitze + "   Schub: " + pg.gschub);
		
		Passagierflugzeug pg2 = new Passagierflugzeug(15.97f, 6, 1.9f);
		System.out.println("Passagierflugzeug: Spannweite: " + pg2.spannw + "  Sitze: " + pg2.sitze + "   Schub: " + pg2.gschub);

	
		
		// eine A380 erzeugen (Jede A380 sieht gleich aus.)
		A380 a380 = new A380();
		System.out.println("A380: Spannweite: " + a380.spannw + "m" + "   Sitze: " + a380.sitze + "   Schub: " + a380.gschub + "  Motoren: " + a380.motoren);
		System.out.println();
		

		
		
		
		
		// XXX hier die Anzahl jeder Kategorie jeweils ausgeben
		System.out.println("Anzahl Flugzeuge: " + (Segelflugzeug.anzahl + Passagierflugzeug.anzahl) );
		System.out.println("Anzahl Segelflugzeuge: " + Segelflugzeug.anzahl);
		System.out.println("Anzahl Passagierflugzeuge: " + Passagierflugzeug.anzahl);
		System.out.println("Anzahl A380: "+ A380.anzahl);

	}
	

		//Instanzmethoden
	public float getSpannw() {
		return spannw;
	}

	public int getSitze() {
		return sitze;
	}

	public float getGschub() {
		return gschub;
	}

	public int getMotoren() {
		return motoren;
	}
	
//	@Override
//	public String toString() {
//		return "Spannweite: " + this.spannw + "m" + "   Sitze: " + this.sitze + "   Schub: " + this.gschub + "   Motoren: " + this.motoren;
//	}

}
