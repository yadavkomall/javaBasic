import java.util.Scanner;
class prime{
public static void main(String args[])
{
System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
boolean isPrime = true;
if(a==1 || a==0){
System.out.println("none");
return;
}
else if(a==2){
System.out.println(a+ " is a prime number");
return;
}
for(int i=2;i<= Math.sqrt(a);i++ )
{
if(a%i==0)
isPrime=false;
break;
}

if(isPrime)
System.out.println(a+ " is a prime number");
else
System.out.println(a+ " is not a prime number");
}
}