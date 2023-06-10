import java.util.Scanner;
class clearBit{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(" Decimal number : ");
int n= sc.nextInt();
int c[] = new int[10000];
int i=0;
int temp=n;
while(temp !=0){
c[i]= temp%2;
temp= temp/2;
i++;
}
System.out.print("Binary number : ");
for(int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();
System.out.print("Enter ith bit to be clear : ");
int ith= sc.nextInt();
int mask= ~(1<<ith);
int clearNum= n&mask;
System.out.println("Clear decimal number : "+clearNum);
int tempClr=clearNum;
int x=0;
int b[]= new int [1000];
while(tempClr!=0){
b[x]=tempClr%2;
x++;
tempClr=tempClr/2;

}
System.out.print("Clear binary number : ");
for(int j=x;j>=0;j--){
System.out.print(b[j]);
}
System.out.println();
}
} 