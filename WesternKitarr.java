public class WesternKitarr extends AkustilineKitarr {
	
	String stringsOrFrets;
	
	public WesternKitarr(int stringsOrFrets) {
		if(stringsOrFrets <= 12) {
			this.stringsOrFrets = String.valueOf(stringsOrFrets) + "-keelne";
		} else {
			this.stringsOrFrets = String.valueOf(stringsOrFrets) + "-fretiga";
		}
	}
	
	@Override
	public String guitarMsg(String brand, String model) {
		return brand + " " + model + " on " + stringsOrFrets + " western tyypi akustiline kitarr";
	}
}