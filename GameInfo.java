class GameInfo extends Game{
	String developer, year, genre;
	public GameInfo(String name, String developer, String year, String genre){
		super(name);
		this.developer = developer;
		this.year = year;
		this.genre = genre;
	}
}
