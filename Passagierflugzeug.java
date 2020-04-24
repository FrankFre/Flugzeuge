
public class Passagierflugzeug extends Flugzeug {

	/* Klassenvariablen */

	static int anzahl = 0;

	private float gschub;

	public Passagierflugzeug(float spannw, int sitze, float gschub) {

		super(spannw, sitze);

		this.gschub = gschub;

		this.anzahl++;

	}

	public float getGschub() {
		// TODO Auto-generated method stub
		return gschub;
	}
}
