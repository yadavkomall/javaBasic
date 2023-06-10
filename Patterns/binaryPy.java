import java.util.Scanner;
class binaryPy{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pyramid : ");
int ln= sc.nextInt();
for(int i=1; i<=ln;i++){
for(int j=1;j<=i;j++){
if((j+i)%2==0){
System.out.print("0"+" ");
}
else
System.out.print("1"+" ");
}
System.out.println();
}

}
}