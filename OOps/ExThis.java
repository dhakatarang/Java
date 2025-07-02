package OOps;

class B{int a=3,b=2;
  void sum(int a, int b){
    this.a=a;
    this.b=b;
    System.out.println(a+" "+b);
  }}
class A extends B{
  void minus(int a,int b){
    int c=a-b;
    System.out.println(c);
  }
}
public class ExThis extends A{
  public static void main(String[] args) {
    B x = new B();
    x.sum(8,3);
    A y=new A();
    y.minus(10,2);
  }
  
}

