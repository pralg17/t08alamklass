public class Kasutus {

    public static void main(String[] args) {
        Kuup kuup = new Kuup(5.0, 10.0);
        System.out.println("Kuubi ruumala on: " + kuup.ruumala() + " ühikut kuubis.");
        System.out.println("Kuubi põhja ümbermõõt on: " + kuup.umbermoot() + " ühikut.");
    }
}
