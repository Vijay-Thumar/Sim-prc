import java.util.*;

class numbergame {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int i, j, k;

int[] A = new int[n];


for(i = 0; i < n; i++)

A[i] = sc.nextInt();

 

for(i = 0; i < n; i++)

{

for(j = i+1; j < n; j++)

{

if(A[i] < A[j])

break;

}

if(j != n)

{

for(k = j+1; k < n; k++)

{

if(A[j] > A[k])

break;

}

if(k != n)

System.out.print(A[k] + " ");

else

System.out.print(-1 + " ");

}

else

System.out.print(-1 + " ");

}

}

}