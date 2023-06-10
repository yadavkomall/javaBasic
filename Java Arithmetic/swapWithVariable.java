import java.util.Scanner;
class swapWithVariable{
public static void main(String args[]){
System.out.println("Before swapping");
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of a : ");
int a = sc.nextInt();
System.out.print("Enter value of b : ");
int b = sc.nextInt();
int temp = a;
a=b;
b=temp;
System.out.println("Value of a : "+a);
System.out.println("Value of b : "+b);
}
}