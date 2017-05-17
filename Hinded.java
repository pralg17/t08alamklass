public class Hinded extends Tulemused{
	
	double hinneJava;
	double hinneC;
	double hinneRobootika;
	
	public Hinded(double hinneJava, double hinneC, double hinneRobootika){
		
		this.hinneJava = hinneJava;
		this.hinneC = hinneC;
		this.hinneRobootika = hinneRobootika;
		
	}
	
	@Override
	public double hinneteKeskmine(){
		
		return (hinneJava+hinneC+hinneRobootika)/3;
		
	}
	
}