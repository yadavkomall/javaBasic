import java.util.Scanner;
class inc_dec{
public static void IncDec(int n){
if(n==0){
return;
}
System.out.println(n);
IncDec(n-1);
System.out.println(n);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of n : ");
int n=sc.nextInt();
IncDec(n);
}
}