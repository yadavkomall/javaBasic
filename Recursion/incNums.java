import java.util.Scanner;
class incNums{
public static void Inc(int n){
if(n==0){
return;
}
Inc(n-1);
System.out.println(n+" ");
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of n : ");
int n = sc.nextInt();
}
}