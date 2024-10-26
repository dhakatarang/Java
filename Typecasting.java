
public class Typecasting {
    public static void main(String[] args) {
        //Scanner input= new Scanner(System.in);
        //float a=input.nextInt();
        //float b=input.nextInt();
       // float c = a+b;
       // System.out.println("The sum is:"+c);
        //destination should be smaller than than the source value.

        //typecasting
        // int dn=(int)(23.4f);
        // System.out.println(d);

        //automatic type promotion in expressions
        // int an= 257;
        // byte bn = (byte)(an);
        // System.out.println(bn);//byte=256 toh remainder as a ans dega ye

       ////Ascii value//unicode value
        //smaller to higher automatic conversion like int to float orrr byte to int
        int i=23;
        byte b=23;
        short s=3;
        long l= 2345L;
        float f= 245.6f;
        double d=235677.56;
        double result=(i*s)+(l*f)-(d/b);
        System.out.println((i*s)+" "+(l*f)+"  "+(d/b));
        System.out.println(result);
    }
    
}
