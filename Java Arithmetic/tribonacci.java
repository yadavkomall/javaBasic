import java.util.Scanner;
class tribonacci{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of n :");
int n = sc.nextInt();
int a=0;
int b=1;
int c=1;
int sum=0;
System.out.print(a+" ");
System.out.print(b+" ");
System.out.print(c+" ");
for(int i=1;i<n-2;i++){
sum=a+b+c;
System.out.print(sum+" ");
a=b;
b=c;
c=sum;
}
System.out.println();
    }
}
