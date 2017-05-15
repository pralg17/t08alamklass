import java.util.*;

public class kodutoo08{
	public static void main(String[] arg){

		kujundid08 ring1 = new ring08(8);
		System.out.println("Ringi joone pikkus on: " + ring1.kujundiPerimeeter() + "\n");
		System.out.println("Ringi pindala on: " + ring1.kujundiPindala() + "\n");

		koonus08 koonus1 = new koonus08(16, 8);
		System.out.println("Koonuse ruumala on: " + koonus1.kujundiRuumala());

	}
}