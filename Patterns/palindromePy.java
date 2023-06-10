import java.util.Scanner;
class palindromePy{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
   System.out.print("Enter length of pyramid : ");
   int ln= sc.nextInt();
   for(int i=0;i<=ln;i++){
       for(int j=1;j<=ln-i;j++){
       System.out.print(" ");
       }
       for(int k=i;k>=1;k--){
       System.out.print(k);
       }
       for(int k=2;k<=i;k++){
       System.out.print(k);
       }
       System.out.println();
   }
   
   
    
}
}