package OOps;

public class Main {
  public static void main(String[] args) {
    //store 5 roll nos
    int[] numbers =new int[5];

    //store 5 names
    String[] names= new String[5];
    
    //dat of 5 students: {roll no, name, marks }
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];


    //To create your own data type that's student here.
    Student[] students = new Student[5];
    Student kunal; //declaring variable
    System.out.println(kunal.rno);
    System.out.println(Arrays.toString(students));

  }

  // create a class
  class Student {
    int[] rno =new int[5];
    String[] name=new String[5];
    float[] marks =new float[5];
  }
  
}
