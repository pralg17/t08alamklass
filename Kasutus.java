public class Kasutus{
    public static void main(String[] args){
        Silinder silinder = new Silinder(1, 1);
        Ring ring = new Ring(1);
        System.out.println("Silindri täispindala on: " + silinder.silindriPindala() + " ruutpsentimeetrit.");
        System.out.println("Ringi pindala on: " + ring.pindala() + " ruutsentimeetrit.");
    }
}
