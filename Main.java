public class Main{

public static void main( String[] args){
	
String ratas1, ratas2, ratas3;
maastikuratas merida=new maastikuratas();
ratas1=merida.ratas(" BIG NINE 9000 ", " Shimano XTR-i ");
System.out.println("jalgratas merida "+ratas1);

jalgratas trek =new maastikuratas();
ratas2=trek.ratas(" x-3245 ", " Shimano XTR-i ");
System.out.println("jalgratas trek "+ratas2);

maanteeratas Cube=new maanteeratas();
ratas3=Cube.ratas(" Axial WLS Pro Disc ", " Shimano Ultegra ");
System.out.println("jalgratas Cube "+ ratas3);

}}


/**

C:\Users\User\java\08>java Main
jalgratas merida  BIG NINE 9000  on  Shimano XTR-i käiguvahetiga maastikuratas
jalgratas trek  x-3245  on  Shimano XTR-i käiguvahetiga maastikuratas
jalgratas Cube  Axial WLS Pro Disc  on  Shimano Ultegra käiguvahetiga maanteeratas


/