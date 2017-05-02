public class Kasutus {

	public static void main(String[] args) {
		Soiduk auto1 = new Soiduk();
		Soiduk auto2 = new Soiduk();
		Soiduk jalgratas = new Jalgratas();
		auto1.omanik = "Mati";
		auto1.keeraVotit();
		auto2.keeraVotit();
		jalgratas.keeraVotit();

	}

}


/*
$ java Kasutus 
	Sõiduk, mille omanik on Mati käivitus.
	Sõiduk käivitus.
	Rattalukk avanes.
*/