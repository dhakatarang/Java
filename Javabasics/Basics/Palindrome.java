import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int num=scan.nextInt();
    int original =0;
    int reversed =0;
     while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if(original == reversed) {
            System.out.println("It's a palindrome number!");
        } else {
            System.out.println("Not a palindrome number.");
        }

        scan.close();
    }
}


