class printreva{
public static void rev(int a[],int i){
if(i==a.length){
return;
}
rev(a,i+1);
System.out.print(a[i]+" ");
}
public static void main(String args[]){
int a[]={1,2,3,4,5};
rev(a,0);
}

}