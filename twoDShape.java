public abstract class twoDShape implements Shape{
private  String shape;

  public twoDShape(String shape){
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
