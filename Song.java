class Song extends Artist{
	String song, genre;
	public Song(String bandName, String song, String genre){
		super(bandName);
		this.song = song;
		this.genre = genre;
	}
	
	public void changeSong(String newSong){
		this.song = newSong;
	}
}