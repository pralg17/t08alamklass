public class Main{
	public static void main(String[] args){
		Kaslane kodukass = new Kaslane("kodukass", 5, true, "mjau");
		kodukass.misHaaltTeeb();
		kodukass.kasOnSaba();
		
		Koerlane hallhunt = new Koerlane("hall hunt", 50, true, "auuuu");
		hallhunt.misHaaltTeeb();
		hallhunt.kasOnSaba();
	}
}