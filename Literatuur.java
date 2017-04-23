public abstract class Literatuur {
   private String nimetus;
   private int lehekyljed;

   public Literatuur (String nimetus, int lehekyljed) {
      System.out.println("koostan raamatu " + nimetus);
      this.nimetus = nimetus;
      this.lehekyljed = lehekyljed;
   }
   
   public String misOnNimetus() {
      return nimetus;
   }
   
   public int misOnLehekyljed() {
      return lehekyljed;
   }
}

