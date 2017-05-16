public class Silinder extends Ruut{

	double a;

	public Silinder(double a){

		super(a);
		this.a = a;

	}
	public double KujundiKorgus(){
		return a;
	}

	public double KujundiRuumala(){

		return KujundiPindala() * a;

	}

}