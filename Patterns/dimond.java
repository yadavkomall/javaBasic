import java.util.Scanner;
class diamond{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pattern : ");
int ln = sc.nextInt();
for(int i=1;i<=ln;i++){
for(int j=1; j<=ln-i;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");
}
System.out.println();
}
for(int i=ln;i>=1;i--){
for(int j=1; j<=ln-i;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");
}
System.out.println();
}


}
}