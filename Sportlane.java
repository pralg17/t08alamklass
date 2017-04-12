class Sportlane {
    String ala, saavutus;

    public void lisaSport(String ala, String saavutus){
       this.ala = ala;
       this.saavutus = saavutus; 
    }

    @Override
    public String toString(){
         return "\nSpordiala: "+ala+"\nParim aavutus: "+saavutus;
    }  
}