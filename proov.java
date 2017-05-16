import java.util.*;

public class proov{
	public static void main(String[] arg){
		
		klass ring1=new ring(4);
		System.out.println("ringi pindala : "+Math.round(ring1.pindala())+ " ja ümbermõõt on: "+ Math.round(ring1.umbermoot()));
		
		
		klass ruut1=new ruut(6);
		System.out.println("ruudu ümbermõõt on "+ruut1.umbermoot()+ " ja pindala on: "+ruut1.pindala());
	}
	
}

//ringi pindala : 50 ja ümbermõõt on: 25
//ruudu ümbermõõt on 24.0 ja pindala on: 36.0
