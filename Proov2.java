public class Proov2{
  public static void main(String[] arg){
    Inimene isik1=new Inimene();
    isik1.eesnimi="Juku";
    isik1.synniaasta=1987;
    Kodanik isik2=new Kodanik();
    isik2.eesnimi="Kati";
    isik2.synniaasta=2010;
    isik2.perekonnanimi="Tamm";
    Kodanik isik3=new Kodanik("Priit", "Veges");
    System.out.println(isik3.synniaasta);
    System.out.println(isik1.synniaasta);
    Inimene[] isikud=new Inimene[4];
    isikud[0]=isik1;
    System.out.println(isikud[0].eesnimi);
    isikud[1]=isik2;
    isikud[2]=new Inimene();
    isikud[2].eesnimi="Juhan";
    isikud[2].synniaasta=1996;
    isikud[3]=new Inimene();
    isikud[3].eesnimi="Kalle";
    isikud[3].synniaasta=1940;
    for (Inimene isik: isikud){
        System.out.println(isik.eesnimi);
        if(isik instanceof Kodanik){
          Kodanik k=(Kodanik)isik;
          System.out.println(" "+k.perekonnanimi);
      }
    }
  }
}
