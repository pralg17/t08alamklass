import java.util.*;

public class Test{
	public static void main(String[] arg){

		Shapes circle1 = new Circle(8);
		System.out.println("The perimeter of this circle is: " + circle1.shapePerimeter() + "\n");
		System.out.println("The area of this circle is: " + circle1.shapeArea() + "\n");

		Cone cone1 = new Cone(16, 8);
		System.out.println("The volume of this cone is: " + cone1.shapeVolume());

	}
}

/*

[karojyrg@greeny proov]$ java Test
The perimeter of this circle is: 50.26548245743669

The area of this circle is: 201.06192982974676

The volume of this cone is: 1072.330292425316

*/
