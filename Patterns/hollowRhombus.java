import java.util.Scanner;
class hollowRhombus{
public static void main(String args){
 Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of pattern : ");
        int ln = sc.nextInt();
        for (int i = 1; i <= ln; i++) {
            for (int j = 1; j <= ln - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ln; j++) {
                if (j == 1 || j == ln || i == 1 || i == ln) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}