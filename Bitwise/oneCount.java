import java.util.Scanner;
class oneCount{
public static void main(String args[]){
System.out.print("Decimal number :");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int c[] = new int [10000];
int temp=n;
int i=0;
while (temp !=0){
c[i]=temp %2;
i++;
temp /= 2;
}
System.out.print("Binary number :");
for(int j=i;j>=0;j--){
System.out.print(c[j]);
}
System.out.println();
int temp2 = n;
int count =0;
while(temp2 !=0){
temp2= (temp2 & (temp2-1));
count++;
}
System.out.println("Number of set bits in "+n+" : "+count);
}
}
//note: number of set bits = number of bit required to covert one binary number to other