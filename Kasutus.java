import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Kasutus {

    public static void main(String[] args) {
        Kuup kuup = new Kuup(5.0, 10.0);
        Kera kera = new Kera(5.0);
        Kolmnurk kolmnurk = new Kolmnurk(5,4,4,6);


        System.out.println("Kuubi ruumala on: " + kuup.ruumala() + " ühikut kuubis.");
        System.out.println("Kuubi põhja ümbermõõt on: " + kuup.umbermoot() + " ühikut.");
        System.out.println();

        System.out.println("Kera pindala on: " + kera.pindala() + " ühikut.");
        System.out.println("Kera ruumala on: " + kera.ruumala() + " ühikut kuubis.");
        System.out.println();

        System.out.println("Kolmnurga pindala on: " + kolmnurk.pindala() + " ühikut.");
        System.out.println("Kolmnurga ümbermõõt on: " + kolmnurk.umbermoot() + " ühikut.");
    }
}
