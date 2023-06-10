class euclidGCD{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number : ");
      int a = sc.nextInt();
      System.out.print("Enter first number : ");
      int b = sc.nextInt();
      int temp1=a;
      int temp2=b;
      while( temp1%temp2!=0){
     int c= temp1%temp2;
     temp1=temp2;
     temp2=c;
      }
    System.out.println("Euclid GCD of "+a+" and "+b+" is "+temp2);
   
      
}
}