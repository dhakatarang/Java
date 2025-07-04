package String;
import java.util.Scanner;

public class Palindrome {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String input=sc.nextLine();

    input=input.replaceAll("\\s+","").toLowerCase();
    boolean isPalindrome=false;

    for(int i=0;i<input.length()/2;i++){
      if(input.charAt(i)==input.charAt(input.length()-i-1)){
        isPalindrome=true;
        
      }
      else{
      isPalindrome=false;
      }


    }
    System.out.println(isPalindrome);
    


  }

}
  

