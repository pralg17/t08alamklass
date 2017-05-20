public class Cube extends threeDShape{
private double b;

  public Cube(String shape, double b ){
  super(shape);
  this.b=b;

  }
  private double getAria(){
    return 6*(b*b);
  }
  private double getVolume(){
    return b* b* b;
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
    return String.format("%s kera on pindalaga, ", super.toString());
  }

}
