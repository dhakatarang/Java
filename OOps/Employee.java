package OOps;

class Student {
  void sum(int a, int b){
    int c=a+b;
    System.out.println(c);
  }
}
public class Employee extends Student{
  public static void main(String[] args) {
    Employee e=new Employee();
    e.sum(4,5);
  }
}
