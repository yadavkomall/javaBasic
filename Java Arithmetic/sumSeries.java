//series = 1 + 1/2 + 1/3 + .......1/n
import java.util.Scanner; 
class sumSeries{
public static void main(String[] args){
System.out.println("Enter the value of n");
Scanner sc = new Scanner(System.in);
double n = sc.nextDouble();
double sum=0;
for(double i=1; i<=n;i++){
System.out.print("1"+"/"+i+" ");
sum += 1/i;
}
System.out.println();
System.out.println("sum = "+sum);
}
}