import java.util.Scanner;
class setBit{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Decimal number : ");
int n = sc.nextInt();
int c[] = new int [1000];
int temp=n;
int i=0;
while(temp !=0){
c[i] = temp%2;
temp = temp/2;
i++;
}
System.out.print("Binary number number : ");
for(int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();
System.out.print("Enter ith bit to be set : ");
int ith = sc.nextInt();
int mask = 1<<ith;
int setNum = n|mask;
System.out.println("Set decimal number : "+setNum);
int setTemp = setNum;
int b[] = new int [1000];
int x=0;
while(setTemp !=0){
b[x]=setTemp%2;
setTemp=setTemp/2;
x++;
}
System.out.print("Set binary number : ");
for(int j=x;j>=0;j--){
System.out.print(b[j]);
}
System.out.println();
}
}