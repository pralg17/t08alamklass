public class Proov1{
	public static void main(String[] args){
		Inimene[] inimesed = new Inimene[3];
		inimesed[0] = new Eestlane("Johan","Eesti keel", "valge");
		inimesed[1] = new Eestlane("Tyrone","Inglise keel", "must");
		inimesed[2] = new Venelane("Vadim", "Vene keel", "valge");
		
		for(int i = 0; i < inimesed.length; i++){
			System.out.println("P2ritoluriik: " + inimesed[i].p2ritoluRiik() + ", nimi: " + inimesed[i].nimi +
				", suhtluskeel: " + inimesed[i].suhtluskeel + ", nahav2rv: "+ inimesed[i].nahav2rv);
		}
		System.out.println("Inimesi kokku: " + Inimene.inimesteArv + ", Eestlasi: " + Eesti.eestlasteArv +
		", Venelasi: " + Venelane.venelasteArv);
	}
}
/*
[johareil@greeny t08alamklass]$ java Proov1
P2ritoluriik: Eesti, nimi: Johan, suhtluskeel: Eesti keel, nahav2rv: valge
P2ritoluriik: Eesti, nimi: Tyrone, suhtluskeel: Inglise keel, nahav2rv: must
P2ritoluriik: Venemaa, nimi: Vadim, suhtluskeel: Vene keel, nahav2rv: valge
Inimesi kokku: 3, Eestlasi: 2, Venelasi: 1

*/