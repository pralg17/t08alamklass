public class ElektriKitarr extends Kitarr {
	
	String strings, frets;
	
	public ElektriKitarr(int strings, int frets) {
		this.strings = String.valueOf(strings) + "-keelne";
		this.frets = String.valueOf(frets) + "-fretiga";
	}
	
	@Override
	public String guitarMsg(String brand, String model) {
		return brand + " " + model + " on " + strings + " ja " + frets + " elektrikitarr";
	}
	
}