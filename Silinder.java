public class Silinder extends Ring{

	double korgus;

	public Silinder(double korgus, double raadius){

		super(raadius);
		this.korgus = korgus;

	}

	public double KujundiRuumala(){

		return KujundiPindala() * korgus;

	}

}