package OOps;

public class Methodoverriding {
  public static void main(String[] args) {
    Course obj=new Java();
    obj.study();
  }
  
}
class Course{
  void study(){
    System.out.println("courses");
  };

}
class Java extends Course{
  void study(){
    System.out.println("Java");
  }

}
class Python extends Course{
   void study(){
    System.out.println("Python");
  }
}
