public abstract class Imetaja {
   private String nimetus;
   private int mass;

   public Imetaja (String nimetus, int mass) {
      System.out.println("\nKonstrueerin imetajat " + nimetus);
      this.nimetus = nimetus;
      this.mass = mass;
   }
   
   public String misOnNimetus() {
      return nimetus;
   }
   
   public int misOnMass() {
      return mass;
   }
}