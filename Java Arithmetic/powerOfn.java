import java.util.Scanner;
class powerOfn{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        boolean Ispower = false;
        int temp = n;
        while (temp != 1) {
            if (temp % p == 0) {
                Ispower = true;
            } else {
                Ispower = false;
                break;
            }
            temp = temp / p;
        }
        if (Ispower == true) {
            System.out.println(n + " can be written in the power of " + p);
        } else {
            System.out.println(n + " cannot be written in the power of " + p);
        }



    }
}