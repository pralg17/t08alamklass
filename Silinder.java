public class Silinder extends Ring{

	double k6rgus;
	double raadius;

	public Silinder(double raadius, double k6rgus){
		super(raadius);
		this.k6rgus = k6rgus;
	}


	public double ruumala(){
		return pindala()* k6rgus;
	}
	
	public double t2ispindala(){
		return (2*Math.PI*super.raadius*k6rgus)+(2*Math.PI*super.raadius*super.raadius);
	}
}