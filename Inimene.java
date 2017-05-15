public abstract class Inimene {
	int vanus;
	Isikukood isikukood;
	Keha pikkus;
	Keha kaal;
	Keha pikkus_kaal;

	public Inimene(Keha pikkus_kaal, int vanus, Isikukood isikukood) {

		if (vanus <= 0) {throw new RuntimeException("Vanus on puudu!");}
		if (vanus >= 150) {throw new RuntimeException("Nii vanu inimesi ei ole olemas!");}
		
		this.pikkus_kaal = pikkus_kaal; this.vanus = vanus; /*this.sugu = sugu;*/ this.isikukood = isikukood;
	}

	public Inimene(double pikkus, double kaal, int vanus, String isikukoodistring) {
		this(new Keha(pikkus, kaal), vanus, new Isikukood(isikukoodistring));
	}

	

	String norm;
	public String BMInorms() {
		if (isikukood.kasNaine() == false) {	// MEES
			if (vanus > 20 && vanus <29) {
				norm = "sinu vanuses inimese keskmine BMI on 25.5 ";
			}
			
			if (vanus > 30 && vanus <39) {
				norm = "sinu vanuses inimese keskmine BMI on 27.5 ";
			}
		}
		if (isikukood.kasNaine() == true) {		// NAINE
			if (vanus > 20 && vanus <29) {
				norm = "sinu vanuses inimese keskmine BMI on 25.6 ";
			}
			
			if (vanus > 30 && vanus <39) {
				norm = "sinu vanuses inimese keskmine BMI on 27.6 ";
			}
		}
		return norm;

	}

	@Override
	public String toString() {
		return "Pikkus: "+pikkus_kaal.pikkus
		+"\nKaal: "+pikkus_kaal.kaal
		+"\nVanus: "+vanus
		+"\nSugu: "+(isikukood.kasNaine()?"Naine ":"Mees ")
		+"\nBMI: "+pikkus_kaal.bmi()+"\n"+BMInorms();
	}

}