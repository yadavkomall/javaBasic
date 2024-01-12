import java.util.Scanner;
class powerOfTwo{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int n = sc.nextInt();
if((n&(n-1))==0 && n!=0){
System.out.println(n+" can be written in the power of 2");
}
else
System.out.println(n+" can not be written in the power of 2");
}
}