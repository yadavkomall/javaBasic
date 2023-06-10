import java.util.Scanner;
class factorial{
public static void main(String [] args){
System.out.println("Enter number");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int fact =1;

for(int i =n; i>=1; i--){
System.out.print(i+" ");
fact *= i;
}System.out.println();
System.out.println("Factorial of "+n+" is : "+fact);
}
}