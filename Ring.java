public class Ring extends Kujundid{
	double raadius;
	public Ring(double raadius){
		this.raadius = raadius;
	}
	@Override
	public double KujundiPindala(){
		return Math.PI * raadius * raadius;
	}
	@Override
	public double KujundiUmbermoot(){
		return 2 * Math.PI * raadius;
	}
}