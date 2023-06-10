import java.util.Scanner;
class factorial{
public static int fact(int n){
if(n==1){
return 1;
}
int f = n*fact(n-1);
return f;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of n : ");
int n= sc.nextInt();
System.out.println("Factorial of "+n+" : "+fact(n));
}
}