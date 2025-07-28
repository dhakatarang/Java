package Javabasics.Functions;
import java.util.Scanner;

public class Questions {
  

  //fimd whether a no. is a prime no. or not
  // public static void main(String[] args){
  // Scanner sc =new Scanner(System.in);
  // int a=sc.nextInt();
  // boolean ans =primeno(a);
  // System.out.println(ans);
  // }

  // static boolean primeno(int a){
  
  // if (a<=1){
  //   return false;
  // }
  // int c=2;
  // while(c*c<=a){
  //   if(a%c==0){
  //     return false;
  //   }
  //   c++;
  // }
  // if(c*c>a){
  //   return true;
  // }
  // else{
  //   return false;
  // }
  // }



  //print all the 3 digit armStrong nos
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=100; i<1000;i++){
      if(isArmstrong(i)){
        System.out.println(i+" ");
      }
    }
    
  }
  static boolean isArmstrong(int n){
    int original = n;
    int sum=0;
    while(n>0){
      int rem=n%10;
      n = n/10;
      sum=sum+ rem*rem*rem;
    }
    return sum== original;
  }

  
}


