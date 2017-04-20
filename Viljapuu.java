public abstract class Viljapuu extends Lehtpuu{
	public static int viljapuudeArv = 0;
	String vili;
	String sort;
	String tyyp = "Viljapuu";
	
	public Viljapuu(){
		viljapuudeArv++;
		//System.out.println("Loodi viljapuu");
	}
	
	public String misTyyp(){
		return tyyp;
	}

}