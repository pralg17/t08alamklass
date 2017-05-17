import java.util.*;

public class Kasutus{
	
	public static void main(String[] args){
		
		Tulemused hinded=new Hinded(72, 100, 52);
		System.out.println("Eksamite keskmine on:" +hinded.hinneteKeskmine());
		
		Tulemused EAPD=new Ained(6, 3, 4);
		System.out.println("Ainete eest saab kokku EAP'si: "+EAPD.EAPkokku());
		
	}
	
	
}