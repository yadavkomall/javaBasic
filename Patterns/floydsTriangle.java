import java.util.Scanner;
class floydsTriangle{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pyramid : ");
int ln = sc.nextInt();
int count =1;
for(int i=1; i<=ln;i++){
for(int j=1; j<=i;j++){
System.out.print(count+" ");
count++;
}
System.out.println();
}

}
}