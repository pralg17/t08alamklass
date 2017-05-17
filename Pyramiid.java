class Pyramiid extends Hulknurk{
	
	double h;
	double pindala;
	
	public Pyramiid(double h, double pindala){
		super(pindala);
		this.h = h;
	}
	

	public double PyramiidRuumala(){
		return 0.333 * pindala * h;
	}
}