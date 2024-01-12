import java.util.Scanner;
class toggleBit{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Decimal number : ");
int n = sc.nextInt();
int c[]= new int[1000];
int temp=n;
int i=0;
while(temp !=0){
c[i]=temp%2;
temp=temp/2;
i++;
}
System.out.print("Binary number : ");
for(int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();
System.out.print("Enter ith bit to toggle : ");
int ith = sc.nextInt();
int mask= 1<<ith;
int tognum = n^mask;
System.out.println("Toggled decimal number : "+tognum);
int temptog= tognum;
int x=0;
while(temptog!=0){
c[x]=temptog%2;
x++;
temptog = temptog/2;
}
System.out.print("Toggled binary number : ");
for(int j=x;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();
}
}
