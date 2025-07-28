package Javabasics.Functions;
import java.util.Arrays;

//when we don't know how many inputs are we be giving
public class VarArgs {
  public static void main(String[] args) {
    fun(12,34,4,4,223); 
    multiple(3,5,"honey");
  }
  static void fun(int ...v){
    System.out.println(Arrays.toString(v));

  }
  static void mutiple(int a, int b,String...v){
    
  }
  
}
