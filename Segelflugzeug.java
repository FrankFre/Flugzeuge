
public class Segelflugzeug extends Flugzeug {

	/* Klassenvariablen */
	
	static int anzahl = 0;


	public Segelflugzeug(float spannw) {
		super(spannw, 1);
//		this.spannw = spannw;
//		this.sitze = 1;
		Segelflugzeug.anzahl++;

	}
	

}