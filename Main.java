public class Main{
	public static void main(String[] args){
		Artist p1 = new Painting("Picasso ","The Weeping Woman ", "Cubism");
		Artist p2 = new Painting("van Gogh ", "The Starry Night ", "Post-Impressionism");
		Artist p3 = new Painting("Kahlo ","The Two Fridas ","Naive art");
		Artist p4 = new Painting("Notke ","Dance of Death ","Allegory");
		
		Artist[] artists = new Artist[4];
		artists[0] = p1;
		artists[1] = p2;
		artists[2] = p3;
		artists[3] = p4;
		
		for (Artist a: artists){
			//et teisi omadusi k2tte saada tuleb artist muuta alamklassiks
			Painting p = (Painting)a;
			System.out.println(p.lastName + p.painting + p.genre);
		}
	}
}
