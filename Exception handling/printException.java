public class printException {
    
    public static void main(String[] args){
    
        try{
        int a =100;
        int b =0;
        int c = a/b;
        }
        
        catch(ArithmeticException ae)
                {
     //   ae.printStackTrace(); //whole object info excep name , descripton, stack tarce
       //System.out.println(ae);
       // System.out.println(ae.toString());//only description and excep name no stack tarce
        System.out.println(ae.getMessage());//only description
        }
    }
}
