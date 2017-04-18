class Poordkeha extends Koonus{
	double moodustaja;
	
	public Poordkeha(double raadius, double moodustaja){
		super(raadius);
		this.moodustaja=moodustaja;
		
		
	}
	public double kylgPindala(){
		return Math.round(Math.PI*raadius*moodustaja);
		
	}
	
	public double taisPindala(){
		return Math.round(pohjaPindala() + kylgPindala());
	}	
	
	
}