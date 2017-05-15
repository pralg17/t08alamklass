public class Proov1 {
	public static void main(String[] args) {
	
		Yliopilane jaan = new Yliopilane(188, 85.5, 25, "38401023456", "bakalaureus", 1);
		Yliopilane jaanus = new Yliopilane(180, 65.5, 31, "49002222745", "bakalaureus", 2);
		Yliopilane jaanika = new Yliopilane(170, 55.5, 33, "50011112234","bakalaureus", 3);	

		Yliopilane[] yliopilased = new Yliopilane[3];
			yliopilased[0] = jaan;
			yliopilased[1] = jaanus;
			yliopilased[2] = jaanika;
			for (int i=0; i<yliopilased.length ;i++ ) {
				System.out.println(yliopilased[i]);
				yliopilased[i].kasOnRebane();
				yliopilased[i].misHaridusaste();
			}
	}
}


/*
Thetloffline:t08alamklass toomasthetloff$ javac *.java
Thetloffline:t08alamklass toomasthetloff$ java Proov1
Pikkus: 188.0
Kaal: 85.5
Vanus: 25
Sugu: Mees
BMI: 24.0
sinu vanuses inimese keskmine BMI on 25.5
Tegemist on rebasega!
Üliõpilane õpib haridusastmel: bakalaureus
Pikkus: 180.0
Kaal: 65.5
Vanus: 31
Sugu: Naine
BMI: 20.0
sinu vanuses inimese keskmine BMI on 27.6
Tegemist on hariliku yli6pilasega.
Üliõpilane õpib haridusastmel: bakalaureus
Pikkus: 170.0
Kaal: 55.5
Vanus: 33
Sugu: Mees
BMI: 19.0
sinu vanuses inimese keskmine BMI on 27.5
Tegemist on hariliku yli6pilasega.
Üliõpilane õpib haridusastmel: bakalaureus*/