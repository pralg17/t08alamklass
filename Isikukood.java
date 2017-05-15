public class Isikukood {
	
	String kood;

	public Isikukood(String uusKood) {
		if(uusKood.length() != 11) {
			throw new RuntimeException("Vigane pikkud: " + uusKood.length());
		}
		kood = uusKood;
	}

	public boolean kasNaine() {
		return Integer.parseInt(kood.substring(0,1)) % 2 == 0;
	}

	public int Synniaasta() {
		if(kood.substring(0,1) .equals("1") || (kood.substring(0,1) .equals("2"))) {
			return 1800 + Integer.parseInt(kood.substring(1,3));
		}
		if(kood.substring(0,1) .equals("3") || (kood.substring(0,1) .equals("4"))) {
			return 1900 + Integer.parseInt(kood.substring(1,3));
		}
		else {
			return 2000 + Integer.parseInt(kood.substring(1,3));
		}
	}

	public int Synnikuunr() {
		return Integer.parseInt(kood.substring(3, 5));
	}

	public String Synnikuunimi() {
		return kuunimed[Synnikuunr()-1];
	}

	static final String[] kuunimed = {"jaanuar", "veebruar", "m2rts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"
	};

	public String Synnikuup2ev() {
		return (kood.substring(5, 7));
	}


}
