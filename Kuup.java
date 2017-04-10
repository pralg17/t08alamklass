class Kuup extends Ruut {

    private double korgus;

    public Kuup(double kulg, double korgus) {
        super(kulg);
        this.korgus = korgus;
    }


    public double ruumala() {
        return pindala() * korgus;
    }

}

