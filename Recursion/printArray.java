class printArray{
public static void printa(int a[],int i){
if(i==a.length){
return;
}
System.out.print(a[i]+" ");
printa(a,i+1);
}
public static void main(String args[]){
int a[]={1,2,3,4,5};
print(a,0);
}

}