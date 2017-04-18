public class Rakendus{
	public static void main(String[] args){
		Poordkeha poordkeha = new Poordkeha(5, 7);
		
		
		System.out.println("Koonus pohja pindala on " + poordkeha.pohjaPindala() +
		"cm ruudus, koonuse kylje pindala on " + poordkeha.kylgPindala() + "cm ruudus ning koonuse taispindalaks on " +
		poordkeha.taisPindala() + "cm ruudus.");
		
	}
}


/* 
javac *.java
java Rakendus

Koonus pohja pindala on 79.0cm ruudus, koonuse kylje pindala on 110.0cing koonuse taispindalaks on 189.0cm ruudus.



*/