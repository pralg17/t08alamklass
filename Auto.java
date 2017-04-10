public class Auto extends Soiduk{
        String hetkelinePaagiOlukord;

    public Auto(String mudeliNimetus) {
        super(mudeliNimetus);
        hetkelinePaagiOlukord = "100%";
    }

    public Auto(String mudeliNimetus, String mootoriKubatuur){
        super(mudeliNimetus, mootoriKubatuur);
        hetkelinePaagiOlukord = "100%";
    }

    @Override
    public String toString(){
        return "Auto " + super.toString()  + " | Paagi seis: " + hetkelinePaagiOlukord;
    }

}