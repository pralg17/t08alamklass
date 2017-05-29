 class Risttahukas extends Ristkylik{
	
	double korgus;
	
	public Risttahukas(double pikkus, double laius, double korgus){
		
		super(laius, pikkus);
		
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		if(korgus <=0){throw new RuntimeException("Sobimatu kõrgus");}
		
		this.korgus=korgus;
	}
	
	//Arvutab Pindala
	public double tahukaPindala(){
		return 2*(pindala()*(pikkus*korgus)*(laius*korgus));
	}
	
}