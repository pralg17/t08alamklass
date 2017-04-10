class Painting extends Artist{
	String painting, genre;
	public Painting(String lastName, String painting, String genre){
		super(lastName);
		this.painting = painting;
		this.genre = genre;
	}
	
	public void changePainting(String newPainting){
		this.painting = newPainting;
	}
}