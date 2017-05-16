
public class Ruut extends Kujundid{

	double a;

	public Ruut(double a){

		this.a = a;

	}
	
	public double KujundiKulg(){
		return a;
	}


	@Override
	public double KujundiPindala(){

		return a * a;

	}

	@Override
	public double KujundiUmbermoot(){

		return 4*a;

	}
}