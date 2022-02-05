import java.util.Scanner;


 

public class bubbleshort {

private static Scanner sc = new Scanner (System.in);

public static void main(String[] args) {

int n = sc.nextInt ();

int[] arr = new int[n];

for(int i=0;i<n;i++){

arr[i]=sc.nextInt ();

}

sc.close ();


 

System.out.println (BubbleSort(arr,n));

}


 

public static int BubbleSort(int[] arr,int n){

int count=0;

boolean swapped;

for(int i=0;i<n-1;i++){

swapped=false;

count++;

for(int j=0;j<n-i-1;j++){

if(arr[j]>arr[j+1]){

 

swap(arr,j,j+1);

swapped=true;

}

}

if(swapped==false){

break;

}

}

return count;

}


 

public static void swap(int[]arr,int i,int j){

int temp;

temp=arr[i];

arr[i]=arr[j];

arr[j]=temp;

}

}