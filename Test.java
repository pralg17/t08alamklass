import java.util.*;

public class Test{
	public static void main(String[] arg){
		
		Shapes rectangle1 = new Rectangle(6, 7);
		System.out.println("The area of this rectangle is: " + rectangle1.shapeArea());
		System.out.println("The perimeter of this rectangle is: " + rectangle1.shapePerimeter() + "\n");
		
		Shapes triangle1 = new Triangle(5, 7, 8);
		System.out.println("The perimeter of this triangle is: " + triangle1.shapePerimeter());
		System.out.println("The area of this triangle is: " + triangle1.shapeArea() + "\n");
		
		//Shapes triangle2 = new Triangle(1, 2, 3); // Error testing
		//System.out.println("the perimeter of this triangle is: " + triangle2.shapePerimeter()); //Doesn't continue to execute the code after the error
		
		Shapes circle1 = new Circle(8);
		System.out.println("The perimeter of this circle is: " + circle1.shapePerimeter());
		System.out.println("The area of this circle is: " + circle1.shapeArea() + "\n");
		
		Cylinder cylinder1 = new Cylinder(8, 6);
		System.out.println("The volume of this cylinder is: " + cylinder1.shapeVolume());
		
	}
}




/*

Results:

[krisliiv@greeny t08alamklass]$ java Test

The area of this rectangle is: 42.0
The perimeter of this rectangle is: 26.0

The perimeter of this triangle is: 20.0
The area of this triangle is: 17.320508075688775

The perimeter of this circle is: 50.26548245743669
The area of this circle is: 201.06192982974676

The volume of this cylinder is: 904.7786842338604


Error message(s):

Exception in thread "main" java.lang.RuntimeException: This kind of triangle cannot exist!
        at Triangle.<init>(Triangle.java:16)
        at Test.main(Test.java:14)



*/