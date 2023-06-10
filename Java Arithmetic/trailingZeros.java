import java.util.Scanner;
class trailingZeros{
public static void main(String args[]){
System.out.println("Enter number")
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int n= sc.nextInt();
long fact=1;
for(int i=n;i>=1;i--){
fact *=i;
}
System.out.println("factorial of "+n+" is "+fact);
int count=0;
long temp=fact;
while(temp%10==0){
count++;
temp=temp/10;
}
System.out.println("No. of trailing zeros in the factorial of "+n+" is "+count);

}}