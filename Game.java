class Game extends Platform{
	String nameGame, yearGame, priceGame;
	public Game(String platform, String nameGame, String yearGame, String priceGame){
		super(platform);
		this.nameGame = nameGame;
		this.yearGame = yearGame;
		this.priceGame = priceGame;
	}
}