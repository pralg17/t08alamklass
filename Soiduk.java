public class Soiduk {

	String omanik;

	public void keeraVotit() {
		if(omanik != null) {
			System.out.println("Sõiduk, mille omanik on " + this.omanik + " käivitus.");
		} else {
			System.out.println("Sõiduk käivitus.");
		}
	}

}