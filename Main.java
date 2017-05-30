public class Main{
	public static void main(String[] args){
		Song s1 = new Song("Radkey, ","Romance Dawn, ", "Garage punk");
		Song s2 = new Song("Radkay, ", "Le Song, ", "Garage punk");
		Song s3 = new Song("The Faint, ","Evil Voices, ","Alternative");
		
		Song[] Songs = new Song[3];
		Songs[0] = s1;
		Songs[1] = s2;
		Songs[2] = s3;
		
		for (Song s: Songs){
			System.out.println(s.bandName + s.song + s.genre);
		}
		s2.changeSong("Dark Black Makeup, ");
		System.out.println("\n\n");
		for (Song s: Songs){
			System.out.println(s.bandName + s.song + s.genre);
		}
	}
}
