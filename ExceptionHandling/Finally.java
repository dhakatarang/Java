package ExceptionHandling;

public class Finally {
  public static void main(String[] args) {
    try{
      int a =10/0;
    }
    catch(Exception e){
      System.out.println("Exception caught"+e);
    }
    finally{
      System.out.println("end");
    }
  }
  
}
