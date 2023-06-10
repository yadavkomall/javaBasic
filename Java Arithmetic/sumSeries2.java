//series= -1/1 + 1/2 - 1/3 + 1/4 - 1/5 + 1/6 - 1/7 ......
import java.util.Scanner;
class sumSeries2{
public static void main(String[] args){
Sytem.out.println("Enter the value of n");
Scanner sc = new Scanner(System.in);
double n = sc.nextDouble();
double sum=0;
for(double i=1; i<=n;i++){
if( (i%2) ==0){
System.out.print("1"+"/"+i+" ");
sum +=1/i;
}
else {
System.out.print("-1"+"/"+i+" ");
sum -=1/i;
}
}
System.out.println();
System.out.println("sum = "+sum);
}
}