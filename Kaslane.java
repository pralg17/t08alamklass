public class Kaslane extends Kiskjaline {
   private String haalitsus;
   
   public Kaslane (String nimetus, int mass, boolean onSaba, String haalitsus) {
	  super(nimetus, mass, onSaba);
	  this.haalitsus = haalitsus;
   }
   
   public void misHaaltTeeb() {
	   System.out.println(misOnNimetus() + " teeb " + haalitsus);
   }
}