public class ring08 extends kujundid08{

	double raadius;
	public ring08(double raadius){
		this.raadius = raadius;
	}


	@Override
	public double kujundiPindala(){
		return Math.PI * raadius * raadius;
	}

	@Override
	public double kujundiPerimeeter(){
		return 2 * Math.PI * raadius;
	}
} 