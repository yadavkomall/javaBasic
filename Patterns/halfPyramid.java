import java.util.Scanner;
class halfPyramid{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pyramid : ");
int l = sc.nextInt();
for(int i=1;i<=l;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}

}
}