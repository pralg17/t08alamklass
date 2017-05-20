public class Avaldaja{
  public static void main (String[]args){
    Shape[] kujud=new Shape[7];
      kujud[0]= new Triangle("2D", 3);
      kujud[1]= new Square("2D", 3);
      kujud[2]= new Circle("2D", 3);
      kujud[3]= new Sphere("2D", 3);
      kujud[4]= new Cube("2D", 3);
      kujud[5]= new Tetrahedron("2D", 3);
      kujud[6]= new Circle("2D", 3);
      for(Shape kujundid : kujud){
        if(kujundid instanceof twoDShape){
        System.out.printf("%s: %.2f\n", kujundid.toString(), kujundid.getAreaValue());
      }else{
        System.out.printf("%s: %.2f %s %.2f\n", kujundid.toString(),
         kujundid.getAreaValue(),"ja ruumalaga", kujundid.getVolumeValue());
      }
      }


  }

}
