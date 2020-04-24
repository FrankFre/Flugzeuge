
public class A380 extends Passagierflugzeug{

	/* Klassenvariablen */
	
	static int anzahl = 0;
	
	static final int motoren = 4;;
	
	static final float spannw = 79.8f;
	static final int sitze = 558;
	static final float gschub = 320;
	

	public A380() {
		super(spannw, sitze, gschub);
			
		this.anzahl++;
	
	}

}
