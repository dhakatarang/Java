package Javabasics.Functions;

public class Scope {
    
    // //one function thing can't be accessed in the another
    // //function scope
    // //block scope{}
    // //values initialized in the block will remain in that  block
    // //if we already initialized a var it can't be done again in the block but we can change the value of that var
    // //name nd no. example

    // public static void main(String[] args) {
    //     int a =10;
    //     int b=20;
    //     String name="Tarang";
    //     {
    //         a = 78; //already initialised outside the block in the same method,hence you cannot initialize
    //         int c= 99;//values initialised in this block,will remain in block
    //         System.out.println(name);
    //     }
    //     int c=100;
    //     System.out.println(name);
    //    // System.out.println(c);//cannot use outside the block
    // }
    

    // static void swap(int a, int b){
    //     int temp=a;
    //     a=b;
    //     b= temp;

    //   //this change will only be valid in this function scope only.
    // }






    //scoping in for loops(i can't be used outside the loop)


    public static void main(String[] args) {
        int a=20;
        for(int i=0; i<4; i++){
            System.out.println(i);
            int num=90;
            a = 10000;
        }
        //System.out.println(i);//error
        //System.out.println(num);

        
    }

    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
    
}
