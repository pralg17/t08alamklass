class Album extends Band{
    String albumName, year, genre;
    public Album(String name, String albumName, String year, String genre){
        super(name);
        this.albumName = albumName;
        this.year = year;
        this.genre = genre;
    }
}
