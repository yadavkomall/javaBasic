import java.util.Scanner;
class pascalTriangle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of pattern : ");
        int ln = sc.nextInt();
        System.out.println();
        int num=1;
        for(int i=0; i< ln;i++){
        for(int j=1;j<=ln-i;j++){
        System.out.print(" ");
        }num=1;
        for(int j=0;j<=i;j++){
       System.out.print(num+" ");
       num = num* (i-j)/(j+1);
        }
        System.out.println();
        }
}
}