class Isik{
    String eesnimi, perekonnanimi, rahvus;
    int vanus;   
    public void lisaisik(String eesnimi, String perekonnanimi, String rahvus, int vanus){
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.rahvus = rahvus;
        this.vanus = vanus;
    } 
    
    @Override
     public String toString(){
         return "\nNimi: " + eesnimi+" "+perekonnanimi+"\nVanus: "+vanus+"\nRahvus: "+rahvus+"\n";
     }            
}

