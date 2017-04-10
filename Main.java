import java.util.*;


public class Main{
	public static void main(String[] args){
	
		List<Animal> Animals = new ArrayList<>();
		
		Animals.add(new Horse("Hobu", "Equus caballus"));
		Animals.add(new Lion("Taavi", "Panthera leo"));
		Animals.add(new Lion("Herakles", "Panthera leo"));
		
		Horse tiit = new Horse("Tiit","Equus caballus");
		
		System.out.println(tiit.Who() + "\n");
		
		for (Animal animal : Animals
                ) {
           System.out.println(animal.Who() + "\n");
        }
	/*
			I am a horse, in latin that is Equus caballus. 
			My name is Tiit and i eat  hay

			I am a horse, in latin that is Equus caballus. 
			My name is Hobu and i eat  hay

			I am a Lion, in latin that is Panthera leo. 
			My name is Taavi  and i eat  other animals

			I am a Lion, in latin that is Panthera leo. 
			My name is Herakles  and i eat  other animals

*/
	
}}