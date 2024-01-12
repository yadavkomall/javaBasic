import java.util.Scanner;
class updateBit{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Decimal number : ");
int n = sc.nextInt();
int c[]= new int[10000];
int temp=n;
int i=0;
while(temp !=0){
c[i]=temp%2;
i++;
temp=temp/2;
}
System.out.print("Binary number : ");
for(int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();

System.out.print("Enter ith bit to update : ");
int ith = sc.nextInt();
int mask=1<<ith;
if((n&mask)==0){
int setNum= n|mask;
System.out.println("Updated decimal number : "+setNum);
int sn [] = new int [1000];
int x=0;
while(setNum!=0){
sn[x]=setNum%2;
x++;
setNum /=2;
}
System.out.print("Updated Binary number : ");
for(int j=x;j>=0;j--){
System.out.print(sn[j]);
}
System.out.println();
}

else{
int newmask = ~(mask);
int clearNum= n & newmask;
System.out.println("Updated decimal number : "+clearNum);
int cn[]= new int[10000];
int y=0;
while(clearNum!=0){
cn[y]= clearNum%2;
y++;
clearNum /=2;
}
System.out.print("Updated Binary number : ");
for(int j=y;j>=0;j--){
System.out.print(cn[j]);
}
System.out.println();
}

}}
