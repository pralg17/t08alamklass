public class Kasutamine {
	public static void main(String[] args) {
		
		String kitarr1, kitarr2, kitarr3, kitarr4;
		
		System.out.println();
		
		Kitarr genericGuitar = new Kitarr();
		kitarr1 = genericGuitar.guitarMsg("Stanford", "'Golden Era P 20 SR natural'");
		System.out.println(kitarr1);
		
		Kitarr acousticGuitar = new AkustilineKitarr();
		kitarr1 = acousticGuitar.guitarMsg("Stanford", "'Golden Era P 20 SR natural'");
		System.out.println(kitarr1);
		
		Kitarr westernGuitar = new WesternKitarr(6);
		kitarr1 = westernGuitar.guitarMsg("Stanford", "'Golden Era P 20 SR natural'");
		System.out.println(kitarr1);
		
		System.out.println();
		
		/*
		[karlbork@greeny t08alamklass]$ java Kasutamine

		Stanford 'Golden Era P 20 SR natural' on kitarr
		Stanford 'Golden Era P 20 SR natural' on akustiline kitarr
		Stanford 'Golden Era P 20 SR natural' on 6-keelne western tyypi akustiline kitarr */

		
		Kitarr classicalGuitar = new KlassikalineKitarr(6);
		kitarr2 = classicalGuitar.guitarMsg("Ramirez", "'3NAE'");
		System.out.println(kitarr2);
		
		classicalGuitar = new KlassikalineKitarr(18);
		kitarr2 = classicalGuitar.guitarMsg("Ramirez", "'3NAE'");
		System.out.println(kitarr2);
		
		System.out.println();
		
		/*
		[karlbork@greeny t08alamklass]$ java Kasutamine

		Ramirez '3NAE' on 6-keelne klassikalist tyypi akustiline kitarr
		Ramirez '3NAE' on 18-fretiga klassikalist tyypi akustiline kitarr */
		
		Kitarr electricGuitar = new ElektriKitarr(7, 24);
		kitarr3 = electricGuitar.guitarMsg("Dean Guitars", "'CS Rusty Cooley Exotic'");
		kitarr4 = electricGuitar.guitarMsg("Diamond Guitars", "'Bird of Prey FM7-FR UV'");
		System.out.println(kitarr3);
		System.out.println(kitarr4);
		
		System.out.println();
		
		/*
		[karlbork@greeny t08alamklass]$ java Kasutamine

		Dean Guitars 'CS Rusty Cooley Exotic' on 7-keelne ja 24-fretiga elektrikitarr
		Diamond Guitars 'Bird of Prey FM7-FR UV' on 7-keelne ja 24-fretiga elektrikitarr */

	}
}