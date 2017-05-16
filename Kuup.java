public class Kuup extends Ruut{

	double a;

	public Kuup(double a){

		super(a);
		this.a = a;

	}

	public double KujundiPindala(){

		return 6*(a * a);

	}

  public double KujundiRuumala(){

		return a * a * a;

	}

}