import java.util.Scanner;
class logPower{
public static int logpow(int n,int x){
if(x==0){
return 1;
}
int lp=logpow(n,x/2);
int lpsq=lp*lp;
if(x%2 !=0){
lpsq=n*lpsq;
}
return lpsq;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of n and x : ");
int n= sc.nextInt();
int x=sc.nextInt();
System.out.println(logpow(n,x));
}
}