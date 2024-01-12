/*rsbm: rightmost set bit mask
rsbm of x = x & (x'')
where x'' is two's compliment of x which is equal to (-x)
rsbm = x & (-x) */

import java.util.Scanner;
class rsbm{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Decimal number : ");
int n = sc.nextInt();
int c[]= new int[10000];
int temp=n;
int i=0;
while(temp !=0){
c[i]= temp%2;
temp /=2;
i++;
}System.out.print("Binary number : ");
for (int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();

int rsbm = (n & (-n));
System.out.println("Decimal number of rsbm : "+rsbm);
int r[]=new int[1000];
int x=0;
while(rsbm !=0){
r[x] = rsbm%2;
rsbm /=2;
x++;
}System.out.print("Binary number of rsbm : ");
for(int j=x; j>=0;j--){
System.out.print(r[j]);
}
System.out.println();
    }

}