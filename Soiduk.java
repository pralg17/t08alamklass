public class Soiduk {
    public String mudeliNimetus;
    public String mootoriKubatuur;

    public Soiduk (String mudeliNimetus) {
        this.mudeliNimetus = mudeliNimetus;
        
    }

    public Soiduk (String mudeliNimetus, String mootoriKubatuur){
        this.mudeliNimetus = mudeliNimetus;
        this.mootoriKubatuur = mootoriKubatuur;

    }

    @Override    
    public String toString(){
        String ajutineMudeliNimetus = mudeliNimetus;
        if (mootoriKubatuur != null){
            ajutineMudeliNimetus = ajutineMudeliNimetus + " | " + mootoriKubatuur;
        }

        return ajutineMudeliNimetus;
    }

}