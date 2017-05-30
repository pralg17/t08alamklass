public class Ring extends Kujund{

	double raadius;
	public Ring(double raadius){
		this.raadius = raadius;
	}


	@Override
	public double pindala(){
		return Math.PI * raadius * raadius;
	}

}