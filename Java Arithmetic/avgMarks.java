import java.util.Scanner;
class avgMarks{
public static void main(String[] args){
System.out.println("Enter number of subject");
Scanner sc = new Scanner (System.in);
int n= sc.nextInt();
double marks[]= new double [n];
System.out.println("Enter marks out of 100");
for(int i=0; i<=n-1;i++){
marks[i]= sc.nextDouble();
}
double sum=0;
for(int i=0; i<=n-1;i++){
sum += marks[i]/n;
}
System.out.println("Avg marks = "+sum);
}
}