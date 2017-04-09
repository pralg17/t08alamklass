class Ristkulik {

    private double alus1;
    private double alus2;

    public Ristkulik(double alus1, double alus2) {
        this.alus1 = alus1;
        this.alus2 = alus2;
    }


    public double pindala() {
        return alus1 * alus2;
    }

    public double umbermoot() {
        return 2 * (alus1 + alus2);
    }

}
