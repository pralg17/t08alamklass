import java.util.*;

public class Kasutus{
	public static void main(String[] arg){
		Kujund ring = new Ring(5);
		System.out.println("\n5 ühikulise raadiusega ringi pindala on " + ring.pindala() + "\n");
		
		Kujund silinder = new Silinder(5, 10);
		System.out.println("Silindri mille raadius on 5 ühikut ja kõrgus on 10 ühikut\n täispindala on " + silinder.t2ispindala() + 
		"\n ja ruumala on " + silinder.ruumala() + "\n");
	}
}

/*
[raitkeer@greeny t08alamklass]$ java Kasutus

5 ühikulise raadiusega ringi pindala on 78.53981633974483

Silindri mille raadius on 5 ühikut ja kõrgus on 10 ühikut
 täispindala on 471.23889803846896
 ja ruumala on 785.3981633974483

[raitkeer@greeny t08alamklass]$
*/
