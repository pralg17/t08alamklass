public class KlassikalineKitarr extends AkustilineKitarr {
	
	String stringsOrFrets;
	
	public KlassikalineKitarr(int stringsOrFrets) {
		if(stringsOrFrets <= 12) {
			this.stringsOrFrets = String.valueOf(stringsOrFrets) + "-keelne";
		} else {
			this.stringsOrFrets = String.valueOf(stringsOrFrets) + "-fretiga";
		}
	}
	
	@Override
	public String guitarMsg(String brand, String model) {
		return brand + " " + model + " on " + stringsOrFrets + " klassikalist tyypi akustiline kitarr";
	}
}