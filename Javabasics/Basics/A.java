public class A {
  public static void main(String[] args) {
    System.out.println("hello");
    new B().f1();
    new B().f2();
  }
}
class B {
  void f1(){
    System.out.println("A.f1()");
  }
  void f2(){
    System.out.println("A.f2()");
  }
  
}
