
public class Horse extends Animal{
	public Horse(String name, String latinName){
		super(name, latinName);
	}
	
	
	public String Who(){ 
		return"I am a horse, in latin that is " + latinName + ". My name is "+name+" and i eat "+ food();
	}
	
	
	public String food(){
		return " hay ";
	}
}