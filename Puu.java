public abstract class Puu{
	public static int puudeArv = 0;
	String nimetus;
	String ladinaKeeles;
	String k6rgus;
	
	
	public Puu(){
		puudeArv ++;
		//System.out.println("Loodi puu");
	}
	
	public abstract String misTyyp();
}