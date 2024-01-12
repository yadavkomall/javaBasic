import java.util.Scanner;
class rep2uniq2{
public static void main(String args[]){
int a[] = new int [] {1,2,3,4,5,6,7,8,6,5,4,3,2,1};
System.out.print("Given Array : ");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println();
int xor=0;
for(int i=0; i<a.length;i++){
xor= xor^a[i];
}
int rbsm = xor & (-xor);
int x=0;
int y=0;

for(int i=0; i< a.length;i++){
if((rbsm & a[i])==0){
x=x^a[i];
}
else{
y=y^a[i];
}
}
System.out.println("Two unique elements are "+x+" and "+y );

}
}