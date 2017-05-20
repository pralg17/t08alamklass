public class Square extends twoDShape{
private double b;
  public Square(String shape,double b ){
    super(shape);
  this.b=b;
  }
  private double getAria(){
    return (b*b);
  }
  @Override
  public double getAreaValue(){
    return getAria();
  }
  @Override
  public double getVolumeValue(){
    return 0;
  }

	@Override
	public String toString() {
		return String.format("%s ruut on pindalaga, ", super.toString());
	}
}
