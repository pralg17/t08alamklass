public class Kasutus{
	
    public static void main(String[] args){
		Toode t1 = new Toode("Samsung","Galaxy S3","Nutitelefon","2012");
		Toode t2 = new Toode("LG", "G5","Nutitelefon","2016");
		Toode t3 = new Toode("Sony", "Z9D","Televiisor","2016");
		Toode t4 = new Toode("Ford", "Focus","Auto","2008");
		
		Toode[] Tooted = new Toode[4];
		Tooted[0] = t1;
		Tooted[1] = t2;
		Tooted[2] = t3;
		Tooted[3] = t4;
		
		for(Toode t: Tooted){
		System.out.println("Toode: "+t.nimi+" "+t.tooteNimi+", "+t.kategooria+", "+t.aasta);
		}
	}
}