public class Koerlane extends Kiskjaline {
   private String haalitsus;
   
   public Koerlane (String nimetus, int mass, boolean onSaba, String haalitsus) {
	  super(nimetus, mass, onSaba);
	  this.haalitsus = haalitsus;
   }
   
   public void misHaaltTeeb() {
	   System.out.println(misOnNimetus() + " teeb " + haalitsus);
   }
}