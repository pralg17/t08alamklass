public class Main{
	public static void main(String[] args){
		Painting p1 = new Painting("Picasso, ","The Weeping Woman, ", "Cubism");
		Painting p2 = new Painting("van Gogh, ", "The Starry Night, ", "Post-Impressionism");
		Painting p3 = new Painting("Kahlo, ","The Two Fridas, ","Naive art");
		Painting p4 = new Painting("Notke, ","Dance of Death, ","Allegory");
		
		Painting[] Paintings = new Painting[4];
		Paintings[0] = p1;
		Paintings[1] = p2;
		Paintings[2] = p3;
		Paintings[3] = p4;
		
		for (Painting p: Paintings){
			System.out.println(p.lastName + p.painting + p.genre);
		}
		p2.changePainting("The Yellow House, ");
		System.out.println("\n\n");
		for (Painting p: Paintings){
			System.out.println(p.lastName + p.painting + p.genre);
		}
	}
}
