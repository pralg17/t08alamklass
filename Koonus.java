class Koonus{
	double raadius, moodustaja;
	
	Koonus(double raadius){
		this.raadius=raadius;
		
	}
	public double pohjaPindala(){
		
		return Math.round(Math.PI*(raadius*raadius));
		
	}

	
}