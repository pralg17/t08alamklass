public class Arvutused {
	
	
   float z;
   public void korrutamine(float x, float y) {
	  z = x*y;
      System.out.println("Antud arvude korrutis on "+z);
   }

   public void jagamine(float x, float y) {
	  z = x / y;
      System.out.println("Antud arvude jagatis on "+z);
   }
}