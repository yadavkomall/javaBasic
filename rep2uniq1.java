class rep2uniq1{
public static void main(String args){
int a[] = new int []{5,7,6,8,7,5,6,8,3,4,9,9,4};
for(int i=0; i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println();
int xor=0;
for(int i=0;i<a.length;i++){
xor = xor^a[i];
}
System.out.println("Unique value in the given array is "+xor);
}
}