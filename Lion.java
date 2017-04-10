
public class Lion extends Animal{
	public Lion(String name, String latinName){
		super(name, latinName);
	}
	
	
	public String Who(){ 
		return"I am a Lion, in latin that is " + latinName + ". My name is "+ name+"  and i eat "+ food();
	}
	
	
	public String food(){
		return " other animals ";
	}
}