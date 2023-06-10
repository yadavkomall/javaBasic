import java.util.Scanner;
class decNums{
public static void Dec(int n){
if(n==0){
return;
}
System.out.println(n);
Inc(n-1);

}

public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("Enter value of n : ");
int n=sc.nextInt();
Dec(n);
}
}