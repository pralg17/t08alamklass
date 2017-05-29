public class Kasutus{
 	
     public static void main(String[] args){
 		Teacher c1 = new Teacher ("Tallinna Ülikool","Jaan Toots","Informaatika","1985");
		Teacher  c2 = new Teacher ("Tallinna Tehnikaülikool", "Kevin Keevitaja","Tsiviilehitus","1964");
 		Teacher  c3 = new Teacher ("Tartu Ülikool", "Meeli Mesinik","Ajakirjandus","1988");
 		Teacher  c4 = new Teacher ("Järvamaa Kutsehariduskeskus", "Kaidi Kaevaja","Psühholoogia","1972");
 		
 		Teacher [] Teachers = new Teacher[4];
 		Teachers[0] = c1;
 		Teachers[1] = c2;
 		Teachers[2] = c3;
 		Teachers[3] = c4;
 		
 		for(Teacher c: Teachers){
 		System.out.println("Õpetaja " +c.nimi+ ", kelle sünniaasta on " +c.synniaasta+ ", töötab koolis " +c.nimetus+ ", annab ainet " +c.aine);
 		}
 	}
 } 