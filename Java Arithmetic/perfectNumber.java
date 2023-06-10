import java.util.Scanner;
class perfectNumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound : ");
        int a = sc.nextInt();
        System.out.print("Enter upper bound : ");
        int b = sc.nextInt();
        System.out.println("Perfect numbers between " + a + " and " + b + " : ");
        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println(sum + " ");
            }
        }
        System.out.println();

}
}