import java.util.Scanner;
class linerpower{
public static int pow(int n,int x){
if(x==0){
return 1;
}
int p= n*pow(n,x-1);
return p;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of n and x : ");
int n= sc.nextInt();
int x=sc.nextInt();
System.out.println(pow(n,x));
}
}