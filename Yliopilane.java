public class Yliopilane extends Inimene {
	String hariduaste;
	int mitmesOppeaasta;

	public Yliopilane(double pikkus, double kaal, int vanus, String isikukoodistring, String hariduaste, int mitmesOppeaasta) {
		super(pikkus, kaal, vanus, isikukoodistring);
		this.hariduaste = hariduaste;
		this.mitmesOppeaasta = mitmesOppeaasta;
	}

	public void kasOnRebane(){
		if (mitmesOppeaasta == 1) {
			System.out.println("Tegemist on rebasega!");
		} else if (mitmesOppeaasta > 1 && mitmesOppeaasta <= 3) {
			System.out.println("Tegemist on hariliku yli6pilasega.");
		} else if (mitmesOppeaasta > 3) {
			System.out.println("Tegemist on igavese yli6pilasega.");
		}
	}

	public void misHaridusaste() {
		System.out.println("Üliõpilane õpib haridusastmel: " + hariduaste);
	}
}