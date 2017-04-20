public class Rakendus {
   public static void main(String args[]) {
      int a = 20, b = 10;
      ArvudeErinevus arvutus = new ArvudeErinevus();
      // Arvutus klassist ArvudeErinevus
      arvutus.erinevus(a, b);

      // Arvutus klassist Kalkulatsioonid
      arvutus.liitmine(a, b);
      arvutus.korrutamine(a, b);
   }
}

/*
javac ArvudeErinevus.java Rakendus.java Kalkulatsioonid.java
java Rakendus

Antud arvude erinevus on 10
Antud arvude summa on 30
Antud arvude korrutis on 200
*/
