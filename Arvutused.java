class Arvutused {
    int z;
 
    public void liitmine(int x, int y) {
       z = x + y;
       System.out.println("Antud arvude summa on "+z);
    }
 
    public void korrutamine(int x, int y) {
       z = x * y;
       System.out.println("Antud arvude korrutis on "+z);
    }
 }