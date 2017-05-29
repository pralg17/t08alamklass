public class Ristkylik{
	
	//Tekitab muutujad a ja b double andmetüübiga
	double pikkus, laius;
	
	public Ristkylik(double pikkus, double laius){
		
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		
		this.pikkus=pikkus;
		this.laius=laius;
	}
	//Arvutab Pindala
	public double pindala(){
		return pikkus*laius;
	}
	
	//Arvutab ümbermõõdu
	public double ymberm66t(){
		return pikkus+laius+pikkus+laius;
	}
	public String toString(){
		return "Ristkülik "+pikkus+"x"+laius+"m, mille ümbermõõt on: "+
		       ymberm66t()+"m, ning pindalaks "+pindala()+" ruutmeetrit.";
	}
}