class Toode extends Firma{
	String tooteNimi,kategooria,aasta;
	
	public Toode(String nimi,String tooteNimi,String kategooria,String aasta){
		super(nimi);
		this.tooteNimi=tooteNimi;
		this.kategooria=kategooria;
		this.aasta=aasta;
	}
}