package OOps;

public class Inheritance {
  public static void main(String[] args) {
    A a = new A();
    a.f1();
  }
  
}

class A extends Inheritance{
    public void f1(){
    System.out.println("function f1");
  }
}

class B extends A{
   public void f1(){
    super.f1();
    System.out.println("function f1");
  }
}

