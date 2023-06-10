import java.util.Scanner;
class swap{
public static void main(String [] args){
System.out.println("Before swapping");
Scanner sc = new Scanner(System.in);
System.out.print("a = ");
int a = sc.nextInt();
System.out.print("b = ");
int b = sc.nextInt();
System.out.println("After swapping");
a= a^b;
b= a^b;
a= a^b;
System.out.println("a = "+a);
System.out.println("b = "+b);

}
}