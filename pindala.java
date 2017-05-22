public class pindala extends kujundid{
  double pikkus;
  double laius;
  double korgus;
  public pindala(double pikkus, double laius, double korgus){
    this.pikkus = pikkus;
    this.laius = laius;
    this.korgus = korgus;
  }

  @Override
  public double kujundiPindala(){
    return 2 * ((pikkus * laius) + (laius * korgus) + (pikkus * korgus));
  }
}
