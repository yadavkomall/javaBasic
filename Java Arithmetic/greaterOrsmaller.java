import java.util.Scanner;
class greaterOrsmaller{
public static void main(String[] args)
{ Scanner sc= new Scanner(System.in);
System.out.println("Enter three number");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>b){
if(a>c){
System.out.println(a+" is greatest");}
else if(a<c){
System.out.println(c+" is greatest");}
if(b>c)
System.out.println(c+" is smallest");
else if(b<c)
System.out.println(b+" is smallest");
}


if(b>a){
if(b>c){
System.out.println(b+" is greatest");}
else if(b<c){
System.out.println(c+" is greatest");}
if(a<c)
System.out.println(a+" is smallest");
else if(a>c)
System.out.println(c+" is smallest");
}

}
}

