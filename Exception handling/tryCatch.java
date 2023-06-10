import java.io.FileInputStream;

/*
 * try { risky code }
 *
 * catch(ExceptionClassName ref.var.name) { handling code }
 *
 */
public class tryCatch {

    public static void main(String[] args) {

        try {
             FileInputStream fis = new FileInputStream("d:/abc.txt"); // this statement can throw exception in future  
          //  class.forName("com.mysql.jdbc.Driver"); // both are example of compile time exception or checked exception
            //  int a = 100;
            //  int b = 0;
            //int c = a / b; // ArithmeticException
            // System.out.println(c);
            //String name = null;
            //System.out.println(name.length()); //both are example of run time exception or unchecked exception
        }
        catch(Exception e){
        System.out.println(e); //because exception class is the parent class of all exception class
        }

    }
}
