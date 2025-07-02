package OOps;

class Company{
  void name(){
    System.out.println("Wipro");
  }
}
class Employee1 extends Company{
  void profit(int a){
    System.out.println(a);
  }
}

public class Employee2 extends Employee1 {
  void loss(int a){
    System.out.println(a);
  }
  public static void main(String[] args) {
    Employee2 x=new Employee2();
    x.name();
    x.profit(300000);
    x.loss(40000);

  }
  
}
