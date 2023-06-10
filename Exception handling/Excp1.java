import java.io.FileInputStream;
public class Excp1 {

    public static void main(String[] args) {
      // FileInputStream fis = new FileInputStream("d:/abc.txt"); this statement can throw exception in future  
       // class.forName("com.mysql.jdbc.Driver"); // both are example of compile time exception or checked exception
        
        int a =100; 
        int b=0; 
        int c = a/b;
        System.out.println(c);
        
        String name = null;
        System.out.println(name.length()); //both are example of run time exception or unchecked exception
        
    }
}
