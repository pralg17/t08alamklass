public class Cylinder extends Circle{
	
	double height;
	
	public Cylinder(double height, double radius){
		
		super(radius);
		this.height = height;
		
	}
	
	public double shapeVolume(){
		
		return shapeArea() * height;
		
	}
	
}