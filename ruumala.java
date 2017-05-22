public class ruumala extends pindala{
  double pikkus;
  double laius;
  double korgus;

  public ruumala(double pikkus, double laius, double korgus){
    super(pikkus, laius, korgus);
  }

  public double kujundiRuumala(){
    return pikkus * laius * korgus;
  }
}
