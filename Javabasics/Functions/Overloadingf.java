package Javabasics.Functions;
import java.util.Arrays;

public class Overloadingf {
  public static void main(String[] args) {
    fun(34);
    fun("Honey dhaka");
    sum(3,4);
    sum(3,4,5);
    demo("Honey","tarang");
    demo(4,5,6);
    
  }

  //same name and different type/no. of args
  static void fun(int a){
    System.out.println("first one");
   System.out.println(a);
  }
  static void fun(String name){
    System.out.println(name);
  }

  static int sum(int a ,int b){
    return a+b;
  }
  static int sum(int a ,int b,int c){
    return a+b+c;
  }

  static void demo(int ...v){
    System.out.println(Arrays.toString(v));
  }

  static void demo(String ...v){
    System.out.println(Arrays.toString(v));
  }

  
}
