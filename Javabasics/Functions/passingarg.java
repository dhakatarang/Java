package Javabasics.Functions;

public class Passingarg {
    //in java their is no pass by reference their is only pass by value
    // primitives int,short,char-just passing value
    //objects & stuff- passing value of reference
       public static void main(String[] args) {
        String name="Tarang";
        changeName(name);
    }
    static void changeName(String name){
            name="Honey";//not changing creating a new object
    }
}
