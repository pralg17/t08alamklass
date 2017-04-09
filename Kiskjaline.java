public class Kiskjaline extends Imetaja {
   boolean onSaba;
   
   public Kiskjaline(String nimetus, int mass, boolean onSaba) {
	  super(nimetus, mass);
      this.onSaba = onSaba;
   }
   
   public void kasOnSaba() {
	  if(onSaba){
		  System.out.println("tal on saba");
	  } else {
		  System.out.println("tal ei ole saba");
	  }
   }
}