public class Main{
  // Name, builder, maxV, designYear, nickname, yearBuilt, IDN
  public static void main(String[] args) {
    Model germanICE3 = new Model("Velaro 3", "Siemens", 320, 1994, "Really fast for its time", 1997, 1002);
    Model estonianFlirt = new Model("Flirt 3", "Stadler", 160, 2012, "Average at best", 2013, 1412);
    Model DR1A = new Model("DR1A", "Latvian Railways", 123, 1976, "No reason to remember this one", 1982, 84);


  Model[] allModels = new Model[3];
  allModels[0] = germanICE3;
  allModels[1] = estonianFlirt;
  allModels[2] = DR1A;

  for (Model current: allModels) {
    System.out.println("\n" + current.builder + " " + current.name + "\n Designed in " + current.designYear + ", built in " + current.yearBuilt + "\n Max speed " + current.maxSpeed + " km/h\n " + current.idNumber + " " + current.nickName);
  }
  }
}
