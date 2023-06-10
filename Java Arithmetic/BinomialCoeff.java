import java.util.Scanner;


class BinomialCoeff {

    public static int factorial(int z){
        int fact=1;
    for(int i=z;i>=1;i--){
    fact=fact*i;
    }
    return fact;
    }
    
    public static int binCoeff(int n,int r){
    int f_n=factorial(n);
    int f_r=factorial(r);
    int f_nr=factorial(n-r);
    int bin = f_n/(f_r*f_nr);
    return bin;
    }
    
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   int r= sc.nextInt();
   int bc = binCoeff(n,r);
   System.out.println(bc);

    }
}
