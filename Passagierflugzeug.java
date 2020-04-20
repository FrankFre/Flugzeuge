
public class Passagierflugzeug extends Flugzeug {
	
	/* Klassenvariablen */
	
	static int anzahl = 0;
	

	public Passagierflugzeug(float spannw, int sitze, float gschub) {
		
		this.spannw = spannw;
		this.sitze = sitze;
		this.gschub = gschub;
		this.anzahl++;
		
	}
	}
