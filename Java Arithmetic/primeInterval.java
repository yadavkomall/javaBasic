import java.util.Scanner;
class primeInterval{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound :");
        int a = sc.nextInt();
        System.out.print("Enter upper bound :");
        int b = sc.nextInt();
        boolean Isprime = true;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Isprime = false;
                    break;
                }
            else{
                    Isprime = true;
                }

            }
            if (Isprime == true) {
                System.out.print(i + " ");
            }
        }System.out.println();
}
}