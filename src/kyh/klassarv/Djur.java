package kyh.klassarv;


abstract class Djur {
  protected String namn;

  abstract String läte();

  void setNamn(String n)  {  namn = n;  }
  String getNamn()  {  return namn;  }
}
