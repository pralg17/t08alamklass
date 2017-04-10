public class Eksamid extends Tulemused{
	
	double eksam1;
	double eksam2;
	double eksam3;
	double stipp=4.6;
	
	public Eksamid(double eksam1,double eksam2,double eksam3){
		
		this.eksam1 = eksam1;
		this.eksam2 = eksam2;
		this.eksam3 = eksam3;
		
	}
	
	
	@Override
	public String eksamiteKeskmine(){
		if ((eksam1+eksam2+eksam3)/3<stipp){return (eksam1+eksam2+eksam3)/3+" , ei saa stippi.";}
		return (eksam1+eksam2+eksam3)/3+" , saad stippi.";
		
	}
}