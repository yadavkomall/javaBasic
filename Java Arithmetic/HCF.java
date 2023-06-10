import java.util.Scanner;
class  HCF{
public static void main(String[] args){
System.out.print("Enter num1 :");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
System.out.print("Enter num2 :");
int num2 = sc.nextInt();
int min=num1<num2?num1:num2;

int gcd=0;
for(int i=1;i<=min;i++){
if(num1%i==0 && num2%i==0){
gcd=i;
}
}
System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);

int lcm = (num1*num2)/gcd;
System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
}
}