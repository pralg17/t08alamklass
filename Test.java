
import java.util.*;

public class Test{
	public static void main(String[] arg){

	Kujundid ring1 = new Ring(8);
	System.out.println("Ringi ümbermõõt on: " + ring1.KujundiUmbermoot());
	System.out.println("Ringi pindala on: " + ring1.KujundiPindala() + "\n");


    Silinder silinder1 = new Silinder(8, 6);
	System.out.println("Selle silindri ruumala on: " + silinder1.KujundiRuumala() + "\n");

    Kera kera1 = new Kera(8);
    System.out.println("Kera pindala on: " + kera1.KujundiPindala());
    System.out.println("Kera ruumala on: " + kera1.KujundiRuumala() + "\n");

	}
}
