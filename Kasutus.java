import java.util.*;


public class Kasutus{
	public static void main(String[] args){
		
		Tulemused hinded1=new Hinded(5,4,5);
		System.out.println("Hinnete keskmine on "+hinded1.hinneteKeskmine());
		
		Tulemused eksamid1=new Eksamid(5,4,5);
		System.out.println("Eksamite keskmine on "+eksamid1.eksamiteKeskmine());
	}	
	/*
	[ukupode@greeny t08alamklass]$ java Kasutus
	Hinnete keskmine on 4.666666666666667
	Eksamite keskmine on 4.666666666666667 , saad stippi.

	
	
	*/
}