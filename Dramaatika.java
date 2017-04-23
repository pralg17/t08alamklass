


public class Dramaatika extends Ilukirjandus {
   private String autor;
   
   public Dramaatika (String nimetus, int lehekyljed, boolean onEraamat, String autor) {
	  super(nimetus, lehekyljed, onEraamat);
	  this.autor = autor;
   }
   
   public void misAutorOn() {
	   System.out.println(misOnNimetus() + " autoriks " + autor);
   }
}