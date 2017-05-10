public class Rakendus {
   public static void main(String args[]) {
      float a = 400, b = 10;
      KaheArvuErinevus arvutus = new KaheArvuErinevus();

	  //siit siis KaheArvuErienvusest
      arvutus.erinevus(a, b);

	  
	  //siit siis Arvutustest
      arvutus.korrutamine(a, b);
      arvutus.jagamine(a, b);
   }
}

//Kahe arvu erinevus on: 390.0
//Antud arvude korrutis on 4000.0
//Antud arvude jagatis on 40.0