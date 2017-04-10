public class Hinded extends Tulemused{
	
	double hinne1;
	double hinne2;
	double hinne3;
	
	public Hinded(double hinne1,double hinne2,double hinne3){
		
		this.hinne1 = hinne1;
		this.hinne2 = hinne2;
		this.hinne3 = hinne3;
		
	}
	
	
	@Override
	public double hinneteKeskmine(){
		
		return (hinne1+hinne2+hinne3)/3;
		
	}
}