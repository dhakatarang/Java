package Javabasics.Array;
import java.util.*;
import java.util.Scanner;

public class Arrayex{
 public static void main(String[] args) {
    // basic array example
    //Array of primitives
    // int[] arr= {1,2,34};
    
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);}

    //for(int num:arr){//for every element in array, print the element
    //System.out.println(num+"");//here num represents element of the array
    //}


    //taking array as an input from user
    // Scanner in=new Scanner(System.in);
    // int val= in.nextInt();
    // for(int i=0;i<val.length;i++){
    //     int arr[i]=
    // class Main {
    //     public static void main(String[] args) {
         
    //       // create an array
    //       int[] age = {12, 4, 5, 2, 5};
       
    //       // access each array elements
    //       System.out.println("Accessing Elements of Array:");
    //       System.out.println("First Element: " + age[0]);
    //       System.out.println("Second Element: " + age[1]);
    //       System.out.println("Third Element: " + age[2]);
    //       System.out.println("Fourth Element: " + age[3]);
    //       System.out.println("Fifth Element: " + age[4]);
    //     }
    //    }


    // public class Array{
    //   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    //     int input=in.nextInt();
    //     int i=0;
    //     int n = 25;



    //Array of objects
    String[] str =new String[4];
    for(int i =0;i<str.length;i++){
        str[i]=in.next();
    }  
    System.out.println(Arrays.toString(str));

    //modify 
    str[1]="kunal";
    System.out.println(Arrays.toString(str));
     }
    }


  

