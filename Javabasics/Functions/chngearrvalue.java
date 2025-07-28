package Javabasics.Functions;
import java.util.Arrays;

public class chngearrvalue {
    //string value don't change bcuse we are changing the value while in array we are modifiying the value so it get changed
    //if you make a change to the object via this ref var,same object will be changed
    public static void main(String[] args) {
       int arr[]={1,34,4,56,6};
       changearrvalue(arr);
    System.out.println(Arrays.toString(arr)); }

    static void changearrvalue(int[] nums){
        nums[0]=10;//if you make a change to the object via this ref variable,same object will be changed
    }

}

