public class Kera extends Ring{

	double korgus;
	public Kera(double raadius){
		super(raadius);
	}
	public double KujundiPindala(){
		return 4 * Math.PI * raadius * raadius;
	}
  public double KujundiRuumala(){
		return 4/3 * Math.PI * raadius * raadius * raadius;
	}
}
