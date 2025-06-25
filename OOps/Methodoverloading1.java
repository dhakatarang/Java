package OOps;

public class Methodoverloading1 {
  public static void main(String[] args) {
    Methodoverloading1 obj=new Methodoverloading1();
    obj.greet("Tarang");
    
    
    
  }

  void greet(){
    System.out.println("Hello");
  }
  void greet(String name){
    System.out.println("Hello" +name);
  }

  
}

