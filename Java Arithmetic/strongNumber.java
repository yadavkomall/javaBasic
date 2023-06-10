import java.util.Scanner;
class strongNumber{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter lower bound : ");
int a = sc.nextInt();
System.out.print("Enter lower bound : ");
int b = sc.nextInt();
System.out.println("Strong number between "+a+" to "+b+" :");
for(int j=a;j<=b;j++){
int temp=j;
int fact=1;
int sum=0;
while(temp !=0){
int ld = temp%10;
fact=1;
for(int i=ld;i>=1;i--){
fact *= i;
}
sum += fact;
temp=temp/10;
}
if(j==sum){
System.out.println(j+" ");
}
}

}
}