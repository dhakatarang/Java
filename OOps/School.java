package OOps;

public class School extends Varnika {
  @Override
  void sum() {
    System.out.println("Hello World");
  }
  public static void main(String[] args) {
    School s =new School();
    s.sum();
    s.print();
  }
  
}
abstract class Varnika{
  abstract void sum();
  void print(){
    System.out.println("Hello");
  }
}
