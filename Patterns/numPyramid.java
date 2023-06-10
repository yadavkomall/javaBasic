import java.util.Scanner;
class numPyramid{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pyramid : ");
int ln = sc.nextInt();
for(int i=1;i<=ln;i++){
for(int j=1;j<=ln;j++){
if(j<= ln-i){
System.out.print(" ");
}
else if(j<=ln){
System.out.print(i+" ");
}
}System.out.println();
}

 }}
