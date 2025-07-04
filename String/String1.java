package String;

public class String1{
  public static void main(String[] args) {
    int[] arr={2,3,4,5,19};
    String name="Kunal Kushwaha";
    System.out.println(name);
     //String x ="Tarang";
     //String y="Tarang";


    String a="Tarang";
    System.out.println(a);
    a ="Dhaka";
    System.out.println(a);


    /*String x ="Tarang";
    String y="Tarang";
    String c=a;
    System.out.println(c==a);
    System.out.println(x==y);*/

    //How to create diff object of same value

    String b =new String("Kunal");//creating these values outside the pool but in heap

    //when we only need to check value use .isequals

    String x =new String("Tarang");
    String y=new String("Tarang");
    System.out.println(x==y);
    System.out.println(x.equals(y));
  }
}

