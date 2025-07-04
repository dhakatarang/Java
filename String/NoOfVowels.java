package String;
import java.util.Scanner;
public class NoOfVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input=sc.nextLine();
    input=input.toLowerCase();
    int vowelCount=0;
    for(int i=0;i<input.length();i++){
      char ch =input.charAt(i);
      if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
        vowelCount++;
      }
    }
    System.out.println(vowelCount);
  }
  
}
