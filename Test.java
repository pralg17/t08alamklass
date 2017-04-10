import java.util.*;

public class Test {
	public static void main(String[] arg){
		Kujundid kolmnurk1 = new Kolmnurk(3);
		System.out.println("Yhe serva tetraedri pindala on: " + kolmnurk1.UheServaTetraedriPindala() + " ruudus");
		System.out.println("Tetraedri pindala on: " + kolmnurk1.TetraedriPindala() + " ruudus");
		
		System.out.println("Tetraedri ruumala on: " + kolmnurk1.TetraedriRuumala() + " kuubis");
		
	}
}