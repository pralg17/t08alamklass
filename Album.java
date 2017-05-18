class Album extends Eesnimi{
	String perekonnanimi, sugu;
	int synniaasta;
    public Album(String name, String perekonnanimi, int synniaasta, String sugu){
        super(name);
        this.perekonnanimi = perekonnanimi;
        this.synniaasta = 2017 - synniaasta;
        this.sugu = sugu;
    }
}
