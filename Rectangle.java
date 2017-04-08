import java.util.*;

public class Rectangle extends Shapes{
	
	double width;
	double length;
	
	public Rectangle(double width, double length){
		
		this.width = width;
		this.length = length;
		
	}
	
	@Override
	public double shapeArea(){
		
		double area = width * length;
		return area;
		
	}
	
	@Override
	public double shapePerimeter(){
		
		double perimeter = 2 * (width + length);
		return perimeter;
		
	}
	
	
	
}