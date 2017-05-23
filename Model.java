class Model extends Train {
  String nickName;
  int yearBuilt;
  int idNumber;
  public Model(String name, String builder, double maxSpeed, int designYear, String nickName, int yearBuilt, int idNumber) {
    super(name, builder, maxSpeed, designYear);
    this.nickName = nickName;
    this.yearBuilt = yearBuilt;
    this.idNumber = idNumber;
  }
}
