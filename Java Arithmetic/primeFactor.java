import java.util.Scanner;
class primeFactor{
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int i = 2;
        System.out.print("Prime factors of " + a + " is ");
        while (a != 1) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = a / i;
            } else {
                i++;
            }
        }
        System.out.println();
}
}