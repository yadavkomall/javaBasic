import.java.util.Scanner;
class sumN{
public static void main(String args[]){
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
System.out.print(i+",");
sum += i;
} System.out.println();
System.out.println("sum : "+sum);
}
}