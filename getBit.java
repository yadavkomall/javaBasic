import java.util.Scanner;
class getBit{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int temp=n;
        int b[]= new int[10000];
        int i=0;
        while(temp!=0){
        int l = temp%2;
        b[i] = l;
        temp=temp/2;
        i++;
        }
        for(int j=i;j>=0;j--){
        System.out.print(b[j]);
        }
        System.out.println();
        System.out.print("value of i to get the ith bit : ");
        int ith= sc.nextInt();
        int mask = 1<<ith;
        if((n&mask)==0){
        System.out.println(ith+" bit is zero");
        }
        else
        System.out.println(ith+" bit is one");    
        
    }}