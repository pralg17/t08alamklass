public class Circle extends twoDShape{
private double b;
  public Circle(String shape,double b ){
  super(shape);
  this.b=b;
  }
  private double getAria(){
    return Math.PI*b*b;
  }
  @Override
  public double getAreaValue(){
    return getAria() ;
  }
  @Override
  public double getVolumeValue(){
    return 0;
  }

  @Override
  public String toString() {
    return String.format("%s ring on pindalaga, ", super.toString());
  }
}
