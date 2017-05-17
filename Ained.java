public class Ained extends Tulemused{
	
	double java;
	double c;
	double robootika;
	
	public Ained(double java, double c, double robootika){
		
		this.java = java;
		this.c = c;
		this.robootika = robootika;
		
	}
	
	@Override
	public double EAPkokku(){
		
		return (java+c+robootika);
		
	}
	
}