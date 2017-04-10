package mariam;

public abstract class Animal{
	String latinName;
	Spring region;
	
	public Person(String latinName, String region){
		this.latinName = latinName;
		this.region = region;
	}
	
	public abstract String Who();
}