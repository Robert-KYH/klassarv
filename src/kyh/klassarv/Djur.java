package kyh.klassarv;


abstract class Djur implements iDjur {
  protected String namn;

  public abstract String läte();

  void setNamn(String n)  {  namn = n;  }
  String getNamn()  {  return namn;  }
}
