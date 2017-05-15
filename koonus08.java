public class koonus08 extends ring08{

	double korgus;
	double raadius;

	public koonus08(double korgus, double raadius){
		super(raadius);
		this.korgus = korgus;
	}


	public double kujundiruumala(){
		return kujundiPindala()/3 * korgus;
	}
}