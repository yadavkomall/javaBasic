import java.util.Scanner;
class calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter vlaue1   : ");
        double a = sc.nextDouble();
        System.out.print("Enter operator : ");
        String op = sc.nextLine();
        op = sc.nextLine();
        System.out.print("Enter vlaue2   : ");
        double b = sc.nextDouble();

        switch (op) {
            case "+":
                System.out.println("Result  : " + (a + b));
                break;
            case "-":
                System.out.println("Result  :  " + (a - b));
                break;
            case "/":
                System.out.println("Result  :  " + (a / b));
                break;
            case "%":
                System.out.println("Result  :  " + (a % b));
                break;
             case "*":
                System.out.println("Result  :  " + (a * b));
                break;
            default:
                System.out.println("invalid operator");
        }

}
}