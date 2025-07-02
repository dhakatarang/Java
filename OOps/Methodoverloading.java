package OOps;

public class Methodoverloading {
  public static void main(String[] args) {
    A1 a= new A1();
    a.Add(4,6);
    a.Add(4,7,8);
  }
  
}
class A1{
void Add(int a,int b){
  System.out.println(a+b);}

void Add(int a,int b,int c){
  System.out.println(a+b+c);
}
}
