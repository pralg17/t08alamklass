public class Kera extends Ring {


    public Kera(double raadius) {
        super(raadius);
    }

    public double pindala() {
        return 4 * Math.PI * raadius * raadius;
    }

    public double ruumala(){
        return (1.0/3) * 4 * Math.PI * Math.pow(raadius, 2.0) * raadius;
    }
}
