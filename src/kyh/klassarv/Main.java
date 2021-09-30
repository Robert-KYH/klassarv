package kyh.klassarv;

import kyh.klassarv.*;


class Main {
  private static void print(String s)  {  System.out.println(s);  }

  public static void main(String[] args) {
    Djur[] husdjur = new Djur[3];
    husdjur[0] = new Katt("Texas");
    husdjur[1] = new Hund("Ploppen");
    husdjur[2] = new Iller("Pälskorven");

    for (Djur d:husdjur)  print(d.getNamn()+" säger "+d.läte());
  }
}
