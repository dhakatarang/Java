package Javabasics.Functions;

//shadowing is a practise of using var with same name within the scope that overlaps

public class Shadowing {
  static int x=90;
  public static void main(String[] args) {
    System.out.println(x);//90
    int x=40;//the class variable at line 4 is shadowed by this
    //if only x initialised not given with any value it will cause an error
    //scope will begin when value is initialized
    System.out.println(x);//40
    fun();
  }
  static void fun(){
    System.out.println(x);
  }
    
}
