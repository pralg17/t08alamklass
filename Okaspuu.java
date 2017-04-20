public abstract class Okaspuu extends Puu{
	public static int okaspuudeArv = 0;
	String tyyp = "Okaspuu";
	public Okaspuu(){
		okaspuudeArv ++;
		//System.out.println("Loodi okaspuu");
	}
	public String misTyyp(){
		return tyyp;
	}
	
}