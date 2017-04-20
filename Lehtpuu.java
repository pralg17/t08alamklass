public abstract class Lehtpuu extends Puu{
	public static int lehtpuudeArv = 0;
	String tyyp = "Lehtpuu";
	
	public Lehtpuu(){
		lehtpuudeArv++;
		//System.out.println("Loodi lehtpuu");
	}

	public String misTyyp(){
		return tyyp;
	}
}