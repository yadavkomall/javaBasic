import java.util.Scanner;
class LCM{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number 1 :");
int num1 = sc.nextInt();
System.out.print("Enter number 2 : ");
int num2 = sc.nextInt();
int max= num1>num2?num1:num2;
int lcm=0;
for(int i=max;i<=num1*num2;i=i+max){
if(i%num1==0 && i%num2==0){
lcm=i;
break;
}
}
System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
}
}