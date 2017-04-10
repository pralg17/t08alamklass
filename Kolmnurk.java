public class Kolmnurk extends Kujundid {
	
	double pikkus;
	
	public Kolmnurk(double pikkus){
		this.pikkus = pikkus;	
	}
	
	@Override
	public double UheServaTetraedriPindala() {
		double pindala = (Math.pow(pikkus,2) * Math.sqrt(3)) /4 ;
		return pindala;
	}
	
	@Override
	
	public double TetraedriPindala() {
		double s = Math.pow(pikkus,2) * Math.sqrt(3);
		return s;
	}
	
	public double TetraedriRuumala(){
		double ruumala = (Math.pow(pikkus,3) / 12) * Math.sqrt(2);
		return ruumala;
	}
}