package kyh.klassarv;


class Djur {
  protected String namn;

  Djur(String n)  {  namn = n;  }

  String läte()  {  return "";  }

  void setNamn(String n)  {  namn = n;  }
  String getNamn()  {  return namn;  }
}
