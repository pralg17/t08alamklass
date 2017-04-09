public class Cone extends Circle{

	double height;
	double radius;

	public Cone(double height, double radius){
		super(radius);
		this.height = height;
	}


	public double shapeVolume(){
		return shapeArea()/3 * height;
	}
}
