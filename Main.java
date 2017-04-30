public class Main{
	public static void main(String[] args){
		Song s1 = new Song("In Flames, ","Reflect the Storm, ", "alternative metal");
		Song s2 = new Song("In Flames, ", "Come Clarity, ", "alternative metal");
		Song s3 = new Song("Blind Witness, ","All Alone, ","deathcore");
		
		Song[] Songs = new Song[3];
		Songs[0] = s1;
		Songs[1] = s2;
		Songs[2] = s3;
		
		for (Song s: Songs){
			System.out.println(s.bandName + s.song + s.genre);
		}
		s2.changeSong("Crawl Through Knives, ");
		System.out.println("\n\n");
		for (Song s: Songs){
			System.out.println(s.bandName + s.song + s.genre);
		}
	}
}
/* 
[brigkann@greeny t08alamklass]$ javac *.java
[brigkann@greeny t08alamklass]$ java Main
In Flames, Reflect the Storm, alternative metal
In Flames, Come Clarity, alternative metal
Blind Witness, All Alone, deathcore



In Flames, Reflect the Storm, alternative metal
In Flames, Crawl Through Knives, alternative metal
Blind Witness, All Alone, deathcore
*/