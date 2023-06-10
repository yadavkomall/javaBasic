import java.util.Scanner;
class countDigit{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int count=0;
int temp=n;
while(temp!=0){
int a = temp%10;
count ++;
temp=temp/10;
}
System.out.println("No. of digits in "+n+" is "+count);

}
}