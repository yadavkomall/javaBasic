import java.util.Scanner;
class fibonacci{
public static void main(String [] args){
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a =0;
int b =1;
System.out.print(a+" "+b+" ");
for(int i =1; i<=n-2;i++){
int c= a+b;
System.out.print(c+" ");
a=b;
b=c;

}

}

}