public abstract class Inimene{
	public static int inimesteArv = 0;
	String nimi;
	String suhtluskeel;
	String nahav2rv;

	
	public Inimene(){
		inimesteArv ++;
	}
	
	public abstract String p2ritoluRiik();
}