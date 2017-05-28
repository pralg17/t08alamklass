public class kuup extends ruut {

    double b;

    public kuup(double a, double b) {
        super(a);
        this.b = b;
    }

    public double ruumala() {
        return pindala()*b;
    }
}