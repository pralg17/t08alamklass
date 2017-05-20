public class Tetrahedron extends threeDShape{
private double b;
  public Tetrahedron(String shape, double b ){
  super(shape);
  this.b=b;
  }
  private double getAria(){
    return (Math.sqrt(3)*b*b);
  }
  private double getVolume(){
    return ((Math.sqrt(2))/12*b*b*b);
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
    return String.format("%s triangel on pindalaga, ", super.toString());
  }

}
