public class Proov1{
	public static void main(String[] args){
		
		Ristkylik laud1=new Ristkylik(6, 10);  //teeb uue ristküliku
		Ristkylik laud2=new Ristkylik(3, 2.5);
		Risttahukas risttahukas = new Risttahukas(10, 7, 5);

		
		System.out.println(laud1.pindala()+" "+laud1.ymberm66t());  //arvutab ja prindib pindala ja ümbermõõdu
		
		System.out.println("Risttahuka pindala on: " + risttahukas.tahukaPindala() + "cm kuubis.");
		
		//Manuaalselt lisatud tekstiga
		System.out.println("Ristküliku laud2 pindala on: "+ laud2.pindala()+" Ning ümbermõõduks: "+laud2.ymberm66t());
		
		//toString funktsiooni kasutades
		System.out.println(laud1.toString());
	}
}