import java.util.Scanner;
class catlanNumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of n : ");
int n = sc.nextInt();
int cn[] = new int [n];
 cn[0]=1;
 cn[1]=1;
 System.out.print(cn[0]+" "+cn[1]+" ");
for(int i=2; i<cn.length;i++){
for(int j=0; j<i;j++){
cn[i] += cn[j] * cn[i-j-1];
}
System.out.print(cn[i]+" ");
}
System.out.println();

}
}
    

