import java.util.Scanner;
class leapYear{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter year : ");
int y = sc.nextInt();
if(y%100==0){
if(y%400==0){
System.out.println("leap year");
}
else
System.out.println("not a leap year");
}

if(y%100 !=0){
if(y%4==0){
System.out.println("leap year");
}
else
System.out.println("not a leap year");
}
}
}