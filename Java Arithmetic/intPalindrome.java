import java.util.Sanner;
class intPalindrome{
public static void main(String args[]){
System.out.println("Enter number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp=n;
int lastd=0;
int reverse=0;
while(temp !=0){
lastd = temp %10;
reverse = reverse*10+lastd;
temp= temp/10;
}
if(reverse == n){
System.out.println(n+" is a palindrome number");
}
else{
System.out.println(n+" is not a palindrome number beacuse its reverse is "+reverse);
}

}
}