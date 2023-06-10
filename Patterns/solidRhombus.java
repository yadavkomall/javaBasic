import java.util.Scanner;
class solidRhombus{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of rhombus : ");
int ln = sc.nextInt();
for(int i=1;i<=ln;i++){
for(int j=1;j<=ln-i;j++){
System.out.print(" ");
}
for(int k=1;k <=ln;k++){
System.out.print("*");
}System.out.println();
}
}
}
