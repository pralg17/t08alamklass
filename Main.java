public class Main{
	public static void main(String[] args){
		Game game1 = new Game("Xbox ", "Tekken 7 ", "2017 ", "59.99 ");
		Game game2 = new Game("PC ", "Sims 4 ", "2014 ", "39.99 ");
		Game game3 = new Game("Wii ", "Mario Kart Wii ", "2008 ", "44.95 ");
		
		Game[] Game = new Game[3];
		Game[0] = game1;
		Game[1] = game2;
		Game[2] = game3;
		
		for(Game p: Game){
			System.out.println(p.platform + p.nameGame + p.yearGame + p.priceGame + "euro");
		}
	}
}

/*
Xbox Tekken 7 2017 59.99 euro
PC Sims 4 2014 39.99 euro
Wii Mario Kart Wii 2008 44.95 euro
*/