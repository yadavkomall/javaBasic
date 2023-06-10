import java.util.Scanner;
class decimalTobinary{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int c[] = new int[10000];
int i=0;
int temp=n;
if(temp ==0){
System.out.println("Binary of zero is "+"00");
System.exit(0);
}
while(temp!= 0){
c[i]= temp%2;
temp=temp/2;
i++;
}
System.out.print("Binary of "+n+" is " );
for(int j = i-1; j>=0;j--) {
System.out.print(c[j]);
}
System.out.println();


}
}