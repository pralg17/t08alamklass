public class Circle extends Shapes{
	
	double radius;
	
	public Circle(double radius){
		
		this.radius = radius;
		
	}
	
	
	@Override
	public double shapeArea(){
		
		return Math.PI * radius * radius;
		
	}
	
	@Override
	public double shapePerimeter(){
		
		return 2 * Math.PI * radius;
		
	}
}