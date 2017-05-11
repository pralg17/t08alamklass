public class Main{
	public static void main(String[] args){
		GameInfo game1 = new GameInfo("Caslevania, ", "Konami, ", "1986, ", "Action/Platformer");
		GameInfo game2 = new GameInfo("Super Metroid, ", "Nintendo R&D1, ", "1994, ", "Action/Adventure");
		GameInfo game3 = new GameInfo("Mortal Kombat, ", "Midway, ", "1992, ", "Fighting");
		GameInfo game4 = new GameInfo("The Legend of Zelda: A Link to the Past, ", "Nintendo EAD, ", "1991, ", "Action/Adventure");
		
		GameInfo[] GamesInfo = new GameInfo[4];
		GamesInfo[0] = game1;
		GamesInfo[1] = game2;
		GamesInfo[2] = game3;
		GamesInfo[3] = game4;
		
		for(GameInfo g: GamesInfo){
			System.out.println(g.name + g.developer + g.year + g.genre);
		}
	}
}


/*
[jantrei@greeny t08alamklass]$ javac *java
[jantrei@greeny t08alamklass]$ java Main
Caslevania, Konami, 1986, Action/Platformer
Super Metroid, Nintendo R&D1, 1994, Action/Adventure
Mortal Kombat, Midway, 1992, Fighting
The Legend of Zelda: A Link to the Past, Nintendo EAD, 1991, Action/Adventure
*/
