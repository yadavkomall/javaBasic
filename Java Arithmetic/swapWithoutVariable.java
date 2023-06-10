import java.util.Scanner;
class swapWithoutVariable{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Before swapping");
System.out.print("Enter value of a : ");
int a = sc.nextInt();
System.out.print("Enter value of b : ");
int b= sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping");
System.out.print("value of a : "+a);
System.out.print("value of b : "+b);
}
}