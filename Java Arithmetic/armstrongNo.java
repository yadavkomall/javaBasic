import java.util.Scanner;
class armstrongNo{
public static void isArmstrong(int a, int b) {
        for (int i = a; i <= b; i++) {
            int sum = 0;
            int temp = i;
            String s = Integer.toString(i);
            while (temp > 0) {

                int lastdigit = temp % 10;

                sum += Math.pow(lastdigit, s.length());
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound : ");
        int a = sc.nextInt();
        System.out.print("Enter upper bound : ");
        int b = sc.nextInt();

        isArmstrong(a, b);
    }
}
