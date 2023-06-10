public class Finally {
    
    public static void main(String args[]){
    
        try{
        
            int a =100,c;
            //int b=2;
            int b=0;
            c=a/b;
            System.out.println(c);
        }
        
        catch(ArithmeticException e){
        
            System.out.println("exception");
            System.out.println(e);
        }
        finally{
        
            System.out.println("i am in finally block");
        }
    }
}
