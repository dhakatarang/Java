package OOps;

public class Car {
  void race(int a){
    System.out.println(a);
  }
  void race(double a){
    System.out.println(a);
  }
  public static void main(String arg[]){
    Car x=new Car();
    x.race(3);
    x.race(4.5);
  }
}
