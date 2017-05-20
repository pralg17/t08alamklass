public class Sphere extends threeDShape{
private double b;
  public Sphere(String shape, double b ){
  super(shape);
  this.b=b;
  }
  private double getAria(){
    return 4*Math.PI*b*b;
  }
  private double getVolume(){
    return (4.0/3)*Math.PI*b*b*b;
  }
  @Override
  public double getAreaValue(){
    return getAria() ;
  }
  @Override
  public double getVolumeValue(){
    return getVolume();
  }

  @Override
  public String toString() {
    return String.format("%s kolmnurk on pindalaga, ", super.toString());
  }
}
