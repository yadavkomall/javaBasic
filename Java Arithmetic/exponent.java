import java.util.Scanner;
 class exponent{
public static void main(String[] args){
System.out.println("enter value of x in x^y");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println("enter value of y in x^y");
int y = sc.nextInt();
int pov=1;
for(int i=1; i<=y; i++){
pov *= x;
}
System.out.println("x^y = "+ pov); 
}
}