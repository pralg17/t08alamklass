public class Rakendus{
	
	public static void main(String[] args){
		Hulknurk hulknurk = new Hulknurk(2);
		Pyramiid pyramiid = new Pyramiid(5, 2);
		System.out.println("Pyramiidi hulknurga pindala on: " +hulknurk.pindala()+ " ruutsentimeetrit.");
		System.out.println("Pyramiidi ruumala on: " + pyramiid.PyramiidRuumala() + " kuupsentimeetrit.");
	}
}

/*
[joosjuha@greeny t08alamklass]$ java Rakendus
Pyramiidi hulknurga pindala on: 4.0 ruutsentimeetrit.
Pyramiidi ruumala on: 6.66 kuupsentimeetrit.
*/