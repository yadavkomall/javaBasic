import java.util.Scanner;
class oddeve{
public static void main(String [] args){
System.out.print("Enter number : ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if( (n&1)==0){
System.out.println(n+" is even");
}
else
System.out.println(n+" is odd");
}
}