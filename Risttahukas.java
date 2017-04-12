class Risttahukas extends Ristkylik{
	
	double korgus;
	
	public Risttahukas(double laius, double pikkus, double korgus){
		super(laius, pikkus);
		this.korgus=korgus;
	}
	
	public double tahukaPindala(){
		return 2*(pindala()*(pikkus*korgus)*(laius*korgus));
	}
}