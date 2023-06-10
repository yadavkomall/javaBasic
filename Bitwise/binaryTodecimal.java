import java.util.Scanner;
Sclass binaryTodecimal{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter binary number : ");
      long n = sc.nextInt();
      long temp=n;
      int bin =0;
      int base=1;
      while(temp !=0){
      long l = temp%10;
      bin += l*base;
      temp=temp/10;
      base= base*2;
      }
      System.out.println("Decimal of "+n+" is "+bin);
      }}
