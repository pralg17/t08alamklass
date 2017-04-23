public class Sportlane extends Isik{
    String ala, saavutus;

    public void Sportlane(String eesnimi, String perekonnanimi, String rahvus, int vanus, String ala, String saavutus){
       this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.rahvus = rahvus;
        this.vanus = vanus;
       this.ala = ala;
       this.saavutus = saavutus; 
    }

    @Override
    public String toString(){
         return "\nNimi: "+eesnimi+" "+perekonnanimi+"\nSpordiala: "+ala+"\nParim aavutus: "+saavutus;
    }  
}