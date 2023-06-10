import java.util.Scanner;
class sumOfDigits{
public static void main(String [] args){
System.out.println("Enter number");
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int temp = n;
int lastd=0;
int sum=0;
while(temp !=0)
{
lastd = temp%10;
sum += lastd;
temp= temp/10;
}

System.out.println("Sum of digits of "+n+" is "+sum);

}
}