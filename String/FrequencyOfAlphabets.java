package String;
import java.util.Scanner;

public class FrequencyOfAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        int[] freq = new int[26];

 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch - 'a']++;
        }

  
        System.out.println("Frequency of each alphabet:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + freq[i]);
            }
        }
    }
}

  

