public class Kodanik extends Inimene{
  String perekonnanimi;

  public Kodanik(){};

  public Kodanik(int synniaasta, String eesnimi, String perekonnanimi){
    super(synniaasta, eesnimi);
    this.perekonnanimi=perekonnanimi;
  }

  public Kodanik(String eesnimi, String perekonnanimi){
    super(-1, eesnimi);
    this.perekonnanimi=perekonnanimi;
  }

}
