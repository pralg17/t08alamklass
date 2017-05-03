class Silinder extends Ring{
    double korgus;
    public Silinder(double radius, double korgus){
        super(radius);
        this.korgus=korgus;
    }
    public double silindriPindala(){
        return 2*Math.PI*radius*(radius+korgus);
    }
}