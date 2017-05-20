public abstract class threeDShape implements Shape{
private String shape;

  public threeDShape(String shape){
    this.shape=shape;
  }
  private String getAria(){
    return shape;
  }
	@Override
	public String toString() {
		return shape;
	}
}
