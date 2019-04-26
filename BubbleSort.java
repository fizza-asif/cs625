class BubbleSort {
public static void main(String[] args ) {
int num[]={958,634,366,756,162,355,160,17,56,12};
int a,b,i,temp =0;
int size=10;


for(i=0;i<10;i++)
System.out.println("The Orignal array is=" +num [i] );
for(a=1;a<size;a++)
for(b=size-1;b>=a;b--){
if(num[b-1]>num[b]){
temp=num[b-1];
num[b-1]=num[b];
num[b]=temp;
}}
for(i=0;i<size;i++)
System.out.println("The array is in sorted form=" +num [i] );
}
}