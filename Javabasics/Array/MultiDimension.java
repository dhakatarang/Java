package Javabasics.Array;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
  public static void main(String[] args) {
    
  /*
   * 123
   * 456
   * 789
   */
  // //Array of Arrays
   
  //  Scanner in =new Scanner(System.in);
  //  //int[][] arr =new int[3][3];

  //  int[][] arr={
  //   {1,2,3}, //0th index
  //   {4,5},   //1st index
  //   {6,7,8,9}//2nd index ->arr2D[2]={6,7,8,9}
  //  };

   int[][] arr=new int[3][2];
   System.out.println(arr.length);//No. of rows
   Scanner sc = new Scanner(System.in);


   //input
    for(int row=0;row<arr.length;row++){
      //for each col in every row
      for(int col=0;col<arr.length;col++){
        arr[row][col]=sc.nextInt();        
     }
    }

    // //output
    // for(int row=0;row<arr.length;row++){
    //   //for each col in every row
    //   for(int col=0;col<arr.length;col++){
    //     System.out.println(arr[row][col]+" ");
    //  }
    //  System.out.println();
    // }

    //output
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(Arrays.toString(arr[i]));
    // }

    //enhanced array
    for(int[] a:arr){
      System.out.println(Arrays.toString(a));
    }
    // for(String[] s:arr){
    //   System.out.println(Arrays.toString(arr));
    // }



   }



  //  public static void main(String[] args) {
  //   int[][] arr ={
  //     {1,2,3,4},
  //     {5,6},
  //     {7,8,9}
  //   };
  //   for(int row=0;row<arr.length;row++){
  //     for(int col=0;col<arr[row].length;col++){
  //       System.out.println(arr[row][col]+" ");

  //     }
  //     System.out.println();
  //   }
  //  }



  

  
}
