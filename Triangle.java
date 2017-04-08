import java.util.*;

public class Triangle extends Shapes{
	
	double side1;
	double side2;
	double side3;
	
	public Triangle(double side1, double side2, double side3){
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if(side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2){
			throw new RuntimeException("This kind of triangle cannot exist!");
		}
		
	}
	
	@Override
	public double shapePerimeter(){
		
		double perimeter = side1 + side2 + side3;
		
		return perimeter;
		
	}
	
	@Override
	public double shapeArea(){
		
		double heron = shapePerimeter() / 2;
		
		return Math.sqrt(heron * (heron - side1) * (heron - side2) * (heron - side3));
	}
	
}