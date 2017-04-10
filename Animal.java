

public abstract class Animal{
	String name;
	String latinName;
	
	public Animal(String name, String latinName){
		this.name = name;
		this.latinName = latinName;
	}
	
	public abstract String Who();
	
	public String name(){
		return name;
	}
}