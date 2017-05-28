public class kasutus{

    public static void main(String[] args){
        andmed r1 = new andmed("Eesti", "Tallinn", "45339", "1.315");
        andmed r2 = new andmed("Venemaa", "Moskva", "17 100 000", "144.555");
        andmed r3 = new andmed("USA", "Washington", "9 834 000", "324.567");
        andmed r4 = new andmed("LAV", "Pretoria", "1 219 090", "55.445");

        andmed[] Andmed = new andmed[4];
        Andmed[0] = r1;
        Andmed[1] = r2;
        Andmed[2] = r3;
        Andmed[3] = r4;

        for(andmed r: Andmed){
        System.out.println(r.maa+" pealinn on "+r.pealinn+". Pindala: "+r.pindala+" km2 ja rahvaarv: "+r.rahvaarv+" miljonit");
        }
    }
}