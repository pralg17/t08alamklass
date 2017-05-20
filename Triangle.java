public class Triangle extends twoDShape{
private double b;
  public Triangle(String shape, double b ){
  super(shape);
  this.b=b;
  }
  private double getAriaTriangle(){
    return (b*b)/2;
  }
  @Override
  public double getAreaValue(){
    return getAriaTriangle() ;
  }
  @Override
  public double getVolumeValue(){
    return 0 ;
  }
	@Override
	public String toString() {
		return String.format("%s kolmnurk on pindalaga ", super.toString());
	}
}
