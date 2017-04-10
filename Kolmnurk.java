class Kolmnurk {

    private double alus;
    private double kaatet1;
    private double kaatet2;
    private double korgus;

    public Kolmnurk(double alus, double kaatet1, double kaatet2, double korgus) {
        this.alus = alus;
        this.kaatet1 = kaatet1;
        this.kaatet2 = kaatet2;
        this.korgus = korgus;
    }


    public double pindala() {
        return (alus * korgus) / 2;
    }

    public double umbermoot() {
        return alus + kaatet1 + kaatet2;
    }
}
