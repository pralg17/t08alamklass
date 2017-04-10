import java.util.ArrayList;

public class Soidukipark {
    private ArrayList<Soiduk> soidukid;

    public Soidukipark(){
        taidamePargi();
    }

    private void taidamePargi() {
        Auto auto1 = new Auto("Audi", "2.5T");
        Auto auto2 = new Auto("BMW");
        Auto auto3 = new Auto("Audi", "3.0TDI");
        Auto auto4 = new Auto("VW", "1.8");

        this.soidukid = new ArrayList<>();
        this.soidukid.add(auto1);
        this.soidukid.add(auto2);
        this.soidukid.add(auto3);
        this.soidukid.add(auto4);

    }

    public void prindiPargiSisu() {
        for (Soiduk soiduk : soidukid){
            System.out.println(soidukid.indexOf(soiduk) + " " + soiduk);
        }

    }

    public void muudaSoidukit(int positsioon, String uusV22rtus) {
        Soiduk soiduk = soidukid.get(positsioon);
        if (soiduk instanceof Auto) {
            ((Auto) soiduk).hetkelinePaagiOlukord = uusV22rtus + "%";
        }

    }

        public void kustutaSoiduk(int positsioon) {
        this.soidukid.remove(positsioon);
    }

    public void lisaSoiduk(Soiduk mingiSuvalineMuutuja) {
        soidukid.add(mingiSuvalineMuutuja);
    }

}