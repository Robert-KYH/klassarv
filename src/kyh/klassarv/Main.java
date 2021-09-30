package kyh.klassarv;


class Main {
  static void print(String s)  {  System.out.println(s);  }

  public static void main(String[] args) {
    Djur[] husdjur = { new Katt("Texas"), new Hund("Ploppen"), new Iller("Pälskorven") };

    for (Djur d:husdjur)  print(d.getNamn()+" säger "+d.läte());
  }
}
