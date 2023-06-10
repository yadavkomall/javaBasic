public class FinallyWoCatch {
    
    public static void main(String args[]){
    
        try{
        
            int a=100;
            int b=0, c;
            c=a/b;
            System.out.println(c);
        }
        
        finally{
        
            System.out.println("in finally block");
        }
    }
}
