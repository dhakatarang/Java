package JavaExceptionHandling;

public class ThrowsKeyword {
    static void checkFile() throws Exception {
        throw new Exception("File not found!");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally{
          System.out.println("end");
        }
    }
}

  

