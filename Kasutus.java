public class Kasutus{

    public static void main(String[] args){
        Silinder silinder = new Silinder(1, 1);
        Ring ring = new Ring(1);
        System.out.println("Silindri täispindala on: " + silinder.silindriPindala() + " ruutpsentimeetrit.");
        System.out.println("Ringi pindala on: " + ring.pindala() + " ruutsentimeetrit.");
    }

}

/*
henry:t08alamklass henrysavi$ java Kasutus
Silindri täispindala on: 12.566370614359172 ruutpsentimeetrit.
Ringi pindala on: 3.141592653589793 ruutsentimeetrit.
 */
