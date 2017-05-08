public abstract class Eesti extends Inimene{
	public static int eestlasteArv = 0;
	String riik = "Eesti";
	public Eesti(){
		eestlasteArv++;
		
	}
	public String p2ritoluRiik(){
		return riik;
	}
}