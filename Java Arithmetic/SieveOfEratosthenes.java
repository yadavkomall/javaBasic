import java.util.Scanner;
class SieveOfEratosthenes{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter highest range ");
int a = sc.nextInt();

int prime[]= new int [1000];

for( int i=2; i<=Math.sqrt(a);i++){
if(prime[i]==0){
for(int j = i*i; j<=a;j +=i){
prime[j]=1;
}
}
}

for(int i=2; i<=a; i++){
if(prime[i]==0){
System.out.print(i+" ");
}
}System.out.println();

}
}