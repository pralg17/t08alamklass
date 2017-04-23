public class Ilukirjandus extends Literatuur {
   boolean onEraamat;
   
   public Ilukirjandus(String nimetus, int lehekyljed, boolean onEraamat) {
	  super(nimetus, lehekyljed);
      this.onEraamat = onEraamat;
   }
   
   public void kasOnEraamat() {
	  if(onEraamat){
		  System.out.println("On E-raamat");
		  } else {
			  System.out.println("EI ole E-raamat");
	  }
   }
}

