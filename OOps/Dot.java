package OOps;
interface Abc{
  void hello();
   default void sum(){
    System.out.println("Hello");
  }
}
public class Dot implements Abc {
  public void hello(){
    System.out.println("hi");
  }
  public static void main(String[] args) {
    Dot d =new Dot();
    d.hello();
    d.sum();
  }
  
}
