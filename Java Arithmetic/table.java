import java.util.Scanner;
class table{
public static void main(String [] args){
System.out.println("Enter value of n to print table till n");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int multi=1;
for(int i=1; i<=n;i++)
{
for(int j=1; j<=10;j++){
multi= i*j;
System.out.print(multi+"  ");
}
System.out.println("");
}
}
}