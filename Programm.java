import java.util.*;

public class Programm{
	public static void main(String[] arg){

	Kujundid r = new Ruut(2);
	System.out.println(" ");
	System.out.println("Sisestasid ruudu kuljeks " + r.KujundiKulg());
	System.out.println("Selle ruudu ümbermõõt on: " + r.KujundiUmbermoot());
	System.out.println("Selle ruudu pindala on: " + r.KujundiPindala());

    Silinder s = new Silinder(5);
	System.out.println(" ");
	System.out.println("Sisestasid ruudu kuljeks " + s.KujundiKulg());
	System.out.println("Selles tuleneva silindri ruumala on: " + s.KujundiRuumala());

    Kuup k = new Kuup(4.2);
	System.out.println(" ");
	System.out.println("Sisestasid ruudu kuljeks " + k.KujundiKulg());
    System.out.println("Selles tuleneva kuubi pindala on: " + k.KujundiPindala());
    System.out.println("Selles tuleneva kuubi ruumala on: " + k.KujundiRuumala());
	System.out.println(" ");

	}
}
// [alarvere@greeny t08alamklass]$ java Programm

// Sisestasid ruudu kuljeks 2.0
// Selle ruudu ümbermõõt on: 8.0
// Selle ruudu pindala on: 4.0

// Sisestasid ruudu kuljeks 5.0
// Selles tuleneva silindri ruumala on: 125.0

// Sisestasid ruudu kuljeks 4.2
// Selles tuleneva kuubi pindala on: 105.84
// Selles tuleneva kuubi ruumala on: 74.08800000000001


