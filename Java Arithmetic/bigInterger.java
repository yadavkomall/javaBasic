import java.util.Scanner;
import java.math.BigInteger;
class bigInteger{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        for (int i = n; i >= 1; i--) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is " + fact);
}
}