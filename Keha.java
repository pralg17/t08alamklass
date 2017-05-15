public class Keha {

	double pikkus, kaal;

	public Keha(double pikkus, double kaal) {
		if (pikkus <= 0) {throw new RuntimeException("Pikkus on puudu!");}
		if (kaal <= 0) {throw new RuntimeException("Kaal on puudu!");}
		
		this.pikkus = pikkus; this.kaal = kaal; 
	}

	public double bmi() {
		return Math.round(kaal / (pikkus*pikkus)*10000);
	}

	@Override
	public String toString() {
		return "Pikkus: "+pikkus+" , Kaal: "+kaal+" , KMI: "+bmi();
	}
}