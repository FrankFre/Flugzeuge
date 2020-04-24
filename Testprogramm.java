
public class Testprogramm {

	public static void main(String[] args) {

		Flugzeug fz = new Flugzeug(17.0f, 1);

		Segelflugzeug sf = new Segelflugzeug(17.0f);

		System.out.println("Segelflugzeug: Spannweite: " + sf.getSpannw() + "m" + "  Sitze: " + sf.getSitze());

		// ein Passagierflugzeug mit 10,97 Spannweite,
		// 4 Plaetzen und 1,3 kN Schub (Cessna 172 P)
		Passagierflugzeug pg = new Passagierflugzeug(10.97f, 4, 1.3f);
		System.out.println("Passagierflugzeug: Spannweite: " + pg.getSpannw() + "  Sitze: " + pg.getSitze()
				+ "   Schub: " + pg.getGschub());

		Passagierflugzeug pg2 = new Passagierflugzeug(15.97f, 6, 1.9f);
		System.out.println("Passagierflugzeug: Spannweite: " + pg2.getSpannw() + "  Sitze: " + pg2.getSitze()
				+ "   Schub: " + pg2.getGschub());

		// eine A380 erzeugen (Jede A380 sieht gleich aus.)
		A380 a380 = new A380();
		System.out.println("A380: Spannweite: " + a380.spannw + "m" + "   Sitze: " + a380.sitze + "   Schub: "
				+ a380.gschub + "  Motoren: " + a380.motoren);
		System.out.println();

		// XXX hier die Anzahl jeder Kategorie jeweils ausgeben
		System.out.println("Anzahl Flugzeuge: " + (Segelflugzeug.anzahl + Passagierflugzeug.anzahl));
		System.out.println("Anzahl Segelflugzeuge: " + Segelflugzeug.anzahl);
		System.out.println("Anzahl Passagierflugzeuge: " + Passagierflugzeug.anzahl);
		System.out.println("Anzahl A380: " + A380.anzahl);

	}

}
