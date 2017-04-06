import java.util.*;

public class Rakendus {
	public static void main(String[] arg){
		Tekstid leidja = new Pikkus();
		leidja.lisa("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque tincidunt risus ac orci auctor gravida quis id massa. Nam felis odio, blandit consectetur viverra a, commodo a eros. Integer at maximus justo, id porttitor augue. Aliquam sagittis efficitur nulla, sit amet rhoncus sapien sollicitudin non. Phasellus quis lorem dignissim, commodo ligula at, aliquam nibh. Mauris eu lacinia purus. Nulla suscipit elementum sodales. Praesent elementum vel quam ut mollis. Morbi eu dapibus lorem. Integer gravida pretium mi quis vehicula. Vivamus magna sapien, gravida at sem at, accumsan consequat ex. Aliquam felis neque, lacinia pharetra vulputate ultricies, placerat ac elit. Maecenas a sagittis tortor. Vestibulum sit amet luctus sem, in sollicitudin purus. Proin et ullamcorper sem, sed facilisis risus.");		
		
		int vastused = leidja.KuiPikk();
		System.out.println("Kogu pikkus: "+vastused);
		
		int vastused2 = leidja.MituA();
		System.out.println("A tähti on: "+vastused2);
		
		int vastused3 = leidja.MituM();
		System.out.println("M tähti on: "+vastused3);
		
		int vastused4 = leidja.Protsent();
		System.out.println("Ilma punktidega, täht a on kasutusel "+vastused4+"%");
	}	
}