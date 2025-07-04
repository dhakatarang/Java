package OOps;

interface A{
  void print();
}
interface B{
  void hello();
}

class Security implements A, B {
  public void print(){
    System.out.println("Hello");
  }
  public void hello(){
    System.out.println("Hi interface");
  }
  public static void main(String args[]){
    Security s =new Security();
    s.hello();
    s.print();
  }
  
}
